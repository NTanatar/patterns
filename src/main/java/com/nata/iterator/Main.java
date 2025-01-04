package com.nata.iterator;

import java.util.Collection;
import java.util.Set;

public class Main {

    static Collection<Book> getBooks() {
        return Set.of(
            Book.builder()
                .title("The Broken Nest")
                .author("Rabindranath Tagore")
                .numberOfPages(90)
                .build(),
            Book.builder()
                .title("Maigret's Pipe")
                .author("Georges Simenon")
                .numberOfPages(336)
                .build(),
            Book.builder()
                .title("Piranesi")
                .author("Susanna Clarke")
                .numberOfPages(272)
                .build());
    }

    public static void main(String[] args) {

        Collection<Book> books = getBooks();

        System.out.println("by num pages:");
        BookIterator byPages = new BookByNumPagesIterator(books);
        while (byPages.hasNext()) {
            System.out.println(byPages.next());
        }

        System.out.println("by title:");
        BookIterator byTitle = new BookByTitleIterator(books);
        while (byTitle.hasNext()) {
            System.out.println(byTitle.next());
        }
    }
}
