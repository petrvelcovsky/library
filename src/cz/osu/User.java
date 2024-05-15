package cz.osu;

public class User {
    private String name;
    private String surname;
    private int idNumber;
    private static int lastAssignedId = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.idNumber = ++lastAssignedId;
    }

    public String getUserSurname() {
        return surname;
    }

    public int getIdNumber() {
        return idNumber;
    }


    @Override
    public String toString() {
        return name + " " + surname;
    }
}
