package io.turntabl.library;

import io.turntabl.library.vars.BookState;
import io.turntabl.library.vars.Category;

public class Book {
    private String title;
    private int isbn;
    private Category category;
    private String author;
    private BookState state;

    public Book(String title, int isbn, Category category, String author, BookState state) {
        this.title = title;
        this.isbn = isbn;
        this.category = category;
        this.author = author;
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public BookState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", category=" + category +
                ", author='" + author + '\'' +
                ", state=" + state +
                '}';
    }
}


