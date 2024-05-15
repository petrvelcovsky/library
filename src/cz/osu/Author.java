package cz.osu;

public class Author {
    private String name;
    private String surname;
    private String birthDate;
    private String deathDate;


    public Author(String name, String surname, String birthDate, String deathDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.deathDate = deathDate;

    }

    public Author(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.deathDate = "";
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + birthDate + "-" + deathDate + ")";
    }
}


