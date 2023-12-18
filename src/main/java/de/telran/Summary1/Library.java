package de.telran.Summary1;

import lombok.*;

@Getter
@Setter
@ToString

public class Library {
    private  String address;
    private long bookNumbers;
    private Book[] books;

    public Library(String address, long bookNumbers, Book[] books) {
        this.address = address;
        this.bookNumbers = bookNumbers;
        this.books = books;
    }
}
