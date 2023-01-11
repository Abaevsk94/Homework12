package Homework12;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getFullName() {
        return (this.name + " " + this.surname);
    }
}
