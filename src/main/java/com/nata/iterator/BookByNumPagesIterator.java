package com.nata.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class BookByNumPagesIterator implements BookIterator {

    private final List<Book> books;
    private int currentIndex;

    public BookByNumPagesIterator(Collection<Book> books){
        this.books = new ArrayList<>(books);
        this.books.sort(Comparator.comparing(Book::getNumberOfPages));
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public Book next() {
        return books.get(currentIndex++);
    }
}
