package cz.osu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Author attenborough = new Author("David", "Attenborough", "1926");
        Author atwood = new Author("Margaret", "Atwood", "1939");
        Author burgess = new Author ("Anthony", "Burgess", "1917", "1993");
        Author capek = new Author("Karel", "Čapek", "1890", "1938");
        Author coetzee = new Author("John Maxwell", "Coetzee", "1940");
        Author doctorow = new Author("Edgar Lawrence", "Doctorow", "1931", "2015");
        Author franzen = new Author("Jonathan", "Franzen", "1959");
        Author hrabal = new Author("Bohumil", "Hrabal", "1914", "1997");
        Author kundera = new Author("Milan", "Kundera", "1929", "2023");
        Author london = new Author("Jack", "London", "1876", "1916");
        Author maugham = new Author("William Somerset", "Maugham", "1874", "1965");
        Author mccarthy = new Author("Cormac", "McCarthy", "1933", "2023");
        Author potok = new Author("Chaim", "Potok", "1929", "2002");
        Author richler = new Author("Mordecai", "Richler", "1931", "2001");
        Author robbins = new Author("Tom", "Robbins", "1932");
        Author toole = new Author("John Kennedy", "Toole", "1937", "1969");
        Author zweig = new Author("Stefan", "Zweig", "1881", "1942");

        Book amok = new Book("Amok", zweig, "1922");
        Book barneyhoVerze = new Book("Barneyho verze", richler, "1997");
        Book cesta = new Book("Cesta", mccarthy, "2006");
        Book demonAlkohol = new Book("Démon alkohol", london, "1903");
        Book jmenujiSeAsherLev = new Book("Jmenuji se Ašer Lev", potok, "1972");
        Book kdyzSeZTeplychKraju = new Book("Když se z teplých krajů vrátí rozpálení invalidé", robbins, "2000");
        Book knihaApokryfu = new Book("Kniha apokryfů", capek, "1932");
        Book knihaSmichuAZapomneni =  new Book("Kniha smíchu a zapomnění", kundera, "1978");
        Book krvavyPolednik = new Book("Krvavý poledník", mccarthy, "1985");
        Book mechanickyPomeranc = new Book("Mechanický pomeranč", burgess, "1962");
        Book mladi = new Book("Mládí", coetzee, "2002");
        Book nesnesitelnaLehkostByti = new Book("Nesnesitelná lehkost bytí", kundera, "1984");
        Book oUdeluCloveka = new Book("O údělu člověka", maugham, "1915");
        Book obsluhovalJsem = new Book("Obsluhoval jsem anglického krále", hrabal, "1971");
        Book obycejnyZivot = new Book("Obyčejný život", capek, "1934");
        Book ostreSledovaneVlaky = new Book("Ostře sledované vlaky", hrabal, "1965");
        Book pochodKMori = new Book("Pochod k moři", doctorow, "2005");
        Book prilisHlucnaSamota = new Book("Příliš hlučná samota", hrabal, "1989");
        Book ragtime = new Book("Ragtime", doctorow, "1975");
        Book spolceniHlupcu = new Book("Spolčení hlupců", toole, "1980");
        Book suttree = new Book("Suttree", mccarthy, "1979");
        Book svetVcerejska = new Book("Svět včerejška", zweig, "1942");
        Book svoboda = new Book("Svoboda", franzen, "2010");
        Book tulakPoHvezdach = new Book("Tulák po hvězdách", london, "1915");
        Book veselice = new Book("Veselice", maugham, "1930");
        Book vyvoleni = new Book("Vyvolení", potok, "1967");
        Book zHlubin = new Book("Z hlubin", atwood, "1972");
        Book zatisiSDatlem = new Book("Zátiší s Datlem", robbins, "1980");
        Book zmateniCitu = new Book("Zmatení citů", zweig, "1927");
        Book zrani = new Book("Zrání", coetzee, "2009");
        Book zivotNaNasiPlanete = new Book("Život na naší planetě", attenborough, "2020");

        User nadaval = new User("Lojzek", "Nasedal");
        User ostrouhalova = new User("Ester","Ostrouhalová");
        User osypalek = new User("Karel", "Osypálek");
        User silhavy = new User("František", "Šilhavý");
        User vomackova = new User("Marta", "Vomáčková");

        Scanner scanner = new Scanner(System.in);

        library.addBookToLibrary(amok); library.addBookToLibrary(barneyhoVerze); library.addBookToLibrary(cesta);
        library.addBookToLibrary(demonAlkohol); library.addBookToLibrary(jmenujiSeAsherLev); library.addBookToLibrary(kdyzSeZTeplychKraju);
        library.addBookToLibrary(knihaApokryfu); library.addBookToLibrary(knihaSmichuAZapomneni); library.addBookToLibrary(krvavyPolednik);
        library.addBookToLibrary(mechanickyPomeranc); library.addBookToLibrary(mladi); library.addBookToLibrary(nesnesitelnaLehkostByti);
        library.addBookToLibrary(oUdeluCloveka); library.addBookToLibrary(obsluhovalJsem); library.addBookToLibrary(obycejnyZivot);
        library.addBookToLibrary(obycejnyZivot); library.addBookToLibrary(obycejnyZivot); library.addBookToLibrary(ostreSledovaneVlaky);
        library.addBookToLibrary(pochodKMori); library.addBookToLibrary(prilisHlucnaSamota); library.addBookToLibrary(ragtime);
        library.addBookToLibrary(spolceniHlupcu); library.addBookToLibrary(suttree); library.addBookToLibrary(svetVcerejska);
        library.addBookToLibrary(svoboda); library.addBookToLibrary(tulakPoHvezdach); library.addBookToLibrary(veselice);
        library.addBookToLibrary(vyvoleni); library.addBookToLibrary(zHlubin); library.addBookToLibrary(zatisiSDatlem);
        library.addBookToLibrary(zmateniCitu); library.addBookToLibrary(zrani); library.addBookToLibrary(zivotNaNasiPlanete);

        library.registerUserToLibrary(nadaval); library.registerUserToLibrary(ostrouhalova); library.registerUserToLibrary(osypalek);
        library.registerUserToLibrary(silhavy); library.registerUserToLibrary(vomackova);

        library.addAuthorsToLibrary();


        /*
        //SEKVENCE PŘÍKAZŮ PRO TESTOVÁNÍ
        System.out.println(library.lendBookByUser("Vomáčková", "Amok"));
        System.out.println(library.lendBookByUser("Vomáčková", "Suttree"));
        System.out.println(library.lendBookByUser("Vomáčková", "Ragtime"));
        System.out.println(library.lendBookByUser("Nadával", "Veselice"));
        System.out.println(library.lendBookByUser("Nadával", "Svoboda"));
        System.out.println(library.lendBookByUser("Osypálek", "Zrání"));
        System.out.println(library.lendBookByUser("Osypálek", "Ragtime"));
        System.out.println();
        System.out.println(library.returnBookFromUser("Vomáčková", "Amok"));
        System.out.println(library.returnBookFromUser("Vomáčková", "Svoboda"));
        System.out.println(library.returnBookFromUser("Vomáčková", "Amok"));
        System.out.println(library.returnBookFromUser("Vomáčková", "Suttree"));
        System.out.println(library.lendBookByUser("Vomáčková", "Amok"));
        System.out.println(library.returnBookFromUser("Nadával", "Svoboda"));
        System.out.println(library.lendBookByUser("Vomáčková", "Amok"));
        System.out.println(library.returnBookFromUser("Nadával", "Veselice"));
        System.out.println(library.lendBookByUser("Nadával", "Vyvolení"));

        System.out.println(library.removeBookByTitle("Amok"));

        System.out.println();
        System.out.println(library.bookBorrowedBy("Z hlubin"));
        System.out.println(library.bookBorrowedBy("Nesmysl"));
        System.out.println(library.bookBorrowedBy("Zrání"));
        System.out.println(library.bookBorrowedBy("Ragtime"));

        System.out.println();
        System.out.println(library.userListOfBorrowedBooks("Osypálek"));
        System.out.println(library.userListOfBorrowedBooks("Oslík"));
        System.out.println(library.userListOfBorrowedBooks("šilhavý"));

        */

        System.out.println("""
                Vyberte si, prosím, jednu z těchto možností:\s
                1 - Vypsat knihy, autory, uživatele v knihovně
                2 - Vyhledat knihu podle názvu\s
                3 - Vyhledat knihy podle autora
                4 - Odebrat knihu z knihovny\s
                5 - Přidat knihu do knihovny
                6 - Vypůjčit knihu uživateli
                7 - Vrátit knihu od uživatele
                8 - Vyhledat uživatele, který má vypůjčenou konkrétní knihu
                9 - Vypsat knihy vypůjčené konkrétním uživatelem
                10 - Zaregistrovat nového uživatele
                0 - Ukončit program""");
        int selection = 0;

        try {
        selection = scanner.nextInt();
        scanner.nextLine();
        } catch(Exception e){
            System.out.println("Nezadal jste celé číslo.");
        }


        while (selection!=0) {

            switch (selection) {
                case 1 -> {
                    System.out.println("Seznam všech knih, autorů a uživatelů v knihovně:");
                    System.out.println(library);
                }
                case 2 -> {
                    System.out.println("Zadejte jméno knihy, kterou chcete vyhledat: ");
                    String title = scanner.nextLine();
                    System.out.println("Výpis hledané knihy:");
                    System.out.println(library.searchBookByTitle(title));
                }
                case 3 -> {
                    System.out.println("Zadejte příjmení autora knihy, kterou chcete vyhledat: ");
                    String author = scanner.nextLine();
                    System.out.println("Výpis hledaných knih autora:");
                    System.out.println(library.searchBooksByAuthor(author));
                }
                case 4 -> {
                    System.out.println("Zadejte jméno knihy, kterou chcete odebrat: ");
                    String titleToRemove = scanner.nextLine();
                    System.out.println(library.removeBookByTitle(titleToRemove));
                }
                case 5 -> {
                    System.out.println("Zadejte název knihy, kterou chcete přidat: ");
                    String title = scanner.nextLine();
                    System.out.println("Zadejte křestní jméno autora knihy, kterou chcete přidat: ");
                    String name = scanner.nextLine();
                    System.out.println("Zadejte příjmení autora knihy, kterou chcete přidat: ");
                    String surname = scanner.nextLine();
                    System.out.println("Zadejte datum narození autora knihy, kterou chcete přidat: ");
                    String birthDate = scanner.nextLine();
                    System.out.println("Zadejte datum úmrtí autora knihy, kterou chcete přidat (nepovinné): ");
                    String deathDate = scanner.nextLine();
                    System.out.println("Zadejte rok vydání knihy, kterou chcete přidat: ");
                    String published = scanner.nextLine();
                    if(deathDate == null) {
                        library.addBookToLibrary(new Book(title, new Author(name, surname, birthDate), published));
                    }else{
                        library.addBookToLibrary(new Book(title, new Author(name, surname, birthDate, deathDate), published));
                    }
                    System.out.println("Kniha byla přidána do knihovny.");
                }
                case 6 -> {
                    System.out.println("Zadejte příjmení uživatele, kterému chcete knihu půjčit: ");
                    String user = scanner.nextLine();
                    System.out.println("Zadejte jmeno knihy, kterou chcete půjčit: ");
                    String title = scanner.nextLine();
                    System.out.println(library.lendBookByUser(user, title));
                }
                case 7 -> {
                    System.out.println("Zadejte příjmení uživatele, od kterého chcete knihu vrátit: ");
                    String user = scanner.nextLine();
                    System.out.println("Zadejte jmeno knihy, kterou chcete vrátit: ");
                    String title = scanner.nextLine();
                    System.out.println(library.returnBookFromUser(user, title));
                }
                case 8 -> {
                    System.out.println("Zadejte název knihy, u které chcete zjistit, kdo ji má půjčenou: ");
                    String title = scanner.nextLine();
                    System.out.println(library.bookBorrowedBy(title));
                }
                case 9 -> {
                    System.out.println("Zadejte příjmení uživatele, u kterého chcete zjistit, jaké knihy má půjčené: ");
                    String user = scanner.nextLine();
                    System.out.println(library.userListOfBorrowedBooks(user));
                }
                case 10 -> {
                    System.out.println("Zadejte křestní jméno pro registraci uživatele: ");
                    String name = scanner.nextLine();
                    System.out.println("Zadejte příjmení pro registraci uživatele: ");
                    String surname = scanner.nextLine();
                    library.registerUserToLibrary(new User(name, surname));
                    System.out.println("Uživatel byl zaregistrován");
                }
                default -> System.out.println("Nevybral jste z čísel 1-10, nebo 0 (pro ukončení).");
            }
            System.out.println();
            System.out.println(" - zvolte 1 pro výpis, 2 nebo 3 pro vyhledání, 4 odebrání, 5 přidání, 6 vypůjčení, 7 vrácení knihy, 8 u koho je kniha, 9 knihy u uživatele, 10 registraci uživatele, nebo 0 pro ukončení programu: ");
            selection = scanner.nextInt();
            scanner.nextLine();

        }

        System.out.println("Program se ukončuje.");

        scanner.close();

    }
}