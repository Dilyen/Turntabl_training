package io.turntabl.library;

import io.turntabl.library.vars.BorrowerType;

import java.util.List;

public class Borrower {

    private String name;
    private int id;
    private String dateBorrowed;
    private String dateToReturn;
    private String timeToReturn;
    private BorrowerType type;
    private List <Book> books;


    public Borrower(String name, int id, String dateBorrowed, String dateToReturn, String timeToReturn, BorrowerType type, List<Book> books) {
        this.name = name;
        this.id = id;
        this.dateBorrowed = dateBorrowed;
        this.dateToReturn = dateToReturn;
        this.timeToReturn = timeToReturn;
        this.books = books;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDateBorrowed() {
        return dateBorrowed;
    }

    public String getDateToReturn() {
        return dateToReturn;
    }

    public String getTimeToReturn() {
        return timeToReturn;
    }

    public List<Book> getBooks() {
        return books;
    }

    public BorrowerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateBorrowed='" + dateBorrowed + '\'' +
                ", dateToReturn='" + dateToReturn + '\'' +
                ", timeToReturn='" + timeToReturn + '\'' +
                ", type=" + type +
                ", books=" + books +
                '}';
    }
}
