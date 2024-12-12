package com.nata.chainofresponsibility;

import java.util.List;

public class Main {

    public static void checkIsSpam(Message m) {
        List<Filter> filters = List.of(
            new PersonalFilter(),
            new CommonFilter());

        if (filters.stream().anyMatch(filter -> filter.isSpam(m))) {
            System.out.println("it is spam: " + m.getText());
        } else {
            System.out.println("not spam: " + m.getText());
        }
    }

    public static void main(String[] args) {
        checkIsSpam(new Message("some text"));
        checkIsSpam(new Message("bla bla casino"));
        checkIsSpam(new Message("you won 3 million dollars"));
    }
}
