package com.nata.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class BookByTitleIterator implements BookIterator{

    private final List<Book> books;
    private int currentIndex;

    public BookByTitleIterator(Collection<Book> books){
        this.books = new ArrayList<>(books);
        this.books.sort(Comparator.comparing(Book::getTitle));
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
