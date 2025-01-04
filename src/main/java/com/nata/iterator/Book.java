package com.nata.iterator;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Book {
    private String title;
    private String author;
    private int numberOfPages;
}
