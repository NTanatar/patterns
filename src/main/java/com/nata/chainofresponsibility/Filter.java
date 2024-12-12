package com.nata.chainofresponsibility;

public interface Filter {
    boolean isSpam(Message message);
}
