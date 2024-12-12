package com.nata.chainofresponsibility;

public class CommonFilter implements Filter {

    @Override
    public boolean isSpam(Message message) {
        return message.getText().contains("million dollars");
    }
}
