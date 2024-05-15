package cz.osu;

import java.util.*;


public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private HashSet<Author> authors = new HashSet<>();
    private HashMap<Integer, HashSet<Integer>> booksAtUsers = new HashMap<>();

    public void addBookToLibrary(Book book){
        books.add(book);
    }

    public void removeBookFromLibrary (Book book){
        books.remove(book);
    }

    public void registerUserToLibrary(User user){
        users.add(user);
    }

    public void addAuthorsToLibrary(){
        for (Book book : books) {
            authors.add(book.getAuthorAll());
        }
    }

    public Book searchBookByTitle(String bookTitle){
        for (Book book: books){
            if (book.getTitle().toLowerCase().equals(bookTitle.toLowerCase())) return book;
        }
        return null;
    }

    public ArrayList<Book> searchBooksByAuthor(String bookAuthor){
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book: books){
            if (book.getAuthor().toLowerCase().equals(bookAuthor.toLowerCase())) booksByAuthor.add(book);
        }
        return booksByAuthor;
    }

    public String removeBookByTitle(String bookTitle){
        Book searchedBook= searchBookByTitle(bookTitle);
        if (searchedBook != null){
            removeBookFromLibrary(searchedBook);
            return  "Kniha " + bookTitle + " byla odebrána.";
        }else{
            return "Kniha " + bookTitle + " nebyla odebrána, protože se nenachází v knihovně.";
        }
    }

    public String bookBorrowedBy (String bookTitle){

        Book book = searchBook(bookTitle);
        if (book == null) return "Kniha " + bookTitle + " nebyla nalezena.";

        if(!isBookAvailable(book.getIdNumber()))return "Knihu " + book.getTitle() +" nemá nikdo vypůjčenou.";

        User output = null;

        for (Integer key : booksAtUsers.keySet()) {
            HashSet<Integer> idBooks = booksAtUsers.get(key);
            if (idBooks.contains(book.getIdNumber())) { output = searchUserByID(key); }
        }
        return "Knihu " + book.getTitle() + " má půjčenou " + output + ".";
    }

    public String userListOfBorrowedBooks (String userName){

        User user = searchUserByName(userName);
        if (user == null) return "Uživatel " + userName + " nebyl nalezen.";

        Integer key = user.getIdNumber();
        HashSet<Integer> booksId = booksAtUsers.get(key);

        if (booksId == null) return  "Uživatel " + user.getUserSurname() + " nemá půjčenou žádnou knihu.";

        ArrayList<Book> booksByUser = new ArrayList<>();

        for ( Integer book: booksId) {
            booksByUser.add(searchBookByID(book));
        }
        return "Uživatel " +user.getUserSurname() + " má půjčeny tyto knihy: " + displayNameOfBookOnly(booksByUser);
    }



    public String lendBookByUser (String userName, String bookName){

        User user = searchUserByName(userName);
            if (user == null) return "Uživatel " + userName + " nebyl nalezen.";
        Book book = searchBook(bookName);
            if (book == null) return "Kniha " + bookName + " nebyla nalezena.";

            if(isBookAvailable(book.getIdNumber()))return "Knihu " + book.getTitle() +" nelze půjčit, je již vypůjčena.";

        if(booksAtUsers.containsKey(user.getIdNumber())){
           HashSet<Integer> bookId = booksAtUsers.get(user.getIdNumber());
           bookId.add(book.getIdNumber());
        } else {
            HashSet<Integer> bookId = new HashSet<>();
            bookId.add(book.getIdNumber());
            booksAtUsers.put(user.getIdNumber(), bookId);
        }
        return "V pořádku, knihu " + book.getTitle() + " uživateli " + user.getUserSurname() + " zapůjčujeme.";
    }

    public String returnBookFromUser (String userName, String bookName){

        User user = searchUserByName(userName);
            if (user == null) return "Uživatel " + userName + " nebyl nalezen.";
        Book book = searchBook(bookName);
            if (book == null) return "Kniha " + bookName + " nebyla nalezena.";

            if(!isBookAvailable(book.getIdNumber())) return "Kniha " + book.getTitle() +" není nikým vypůjčena.";

        if(!hasBook(user.getIdNumber(),book.getIdNumber())) {
            return "Uživatel " + userName + " nemá knihu " + book.getTitle() + " vypůjčenou.";
        }else {
            HashSet<Integer> userBooks = booksAtUsers.get(user.getIdNumber());
            userBooks.remove(book.getIdNumber());

            if (userBooks.isEmpty())
                booksAtUsers.remove(user.getIdNumber());
        }
        return "V pořádku, knihu " + book.getTitle() + " uživatel " + user.getUserSurname() + " vrací.";
    }

    private User searchUserByName (String username){
        for ( User user: users ) {
            if (user.getUserSurname().toLowerCase().equals(username.toLowerCase())) return user;
        }
        return null;
    }

    private User searchUserByID (int userID){
        for ( User user: users ) {
            if (user.getIdNumber() == userID) return user;
        }
        return null;
    }

    private Book searchBookByID (int bookID ){
        for (Book book: books){
            if ( book.getIdNumber() == bookID) return book;
        }
        return null;
    }

    private Book searchBook (String bookname){
        for ( Book book: books ) {
            if (book.getTitle().toLowerCase().equals(bookname.toLowerCase())) return book;
        }
        return null;
    }

    private boolean isBookAvailable (int idBook){
        for (Integer key : booksAtUsers.keySet()) {
            HashSet<Integer> idBooks = booksAtUsers.get(key);
            if (idBooks.contains(idBook)) return true;
        }
        return false;
    }

    public boolean hasBook(int userId, int bookId) {
        HashSet<Integer> borrowedBookIds = booksAtUsers.get(userId);
        if (borrowedBookIds != null) {
            return borrowedBookIds.contains(bookId);
        }
        return false;
    }

    private String displayNameOfBookOnly(ArrayList<Book> books){
        String output = "";
        for ( Book book : books) {
            output = output + book.getTitle() + " | ";
        }
        return output;
    }

    @Override
    public String toString() {
        return "Seznam knih: " + books + "\n" + "Seznam autorů: " + authors +   "\n" + "Seznam uživatelů: " + users;
    }
}
