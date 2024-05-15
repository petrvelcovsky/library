package cz.osu;

public class Book {
    private String title;
    private Author author;
    private String published;
    private int idNumber;

    private static int lastAssignedId = 100;

    public Book(String title, Author author, String published) {
        this.title = title;
        this.author = author;
        this.published = published;
        this.idNumber = ++lastAssignedId;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.getSurname();
    }

    public Author getAuthorAll() {
        return author;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return title.toString().toUpperCase() + ", " + author + ", published in " + published;
    }
}
