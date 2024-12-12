package com.nata.chainofresponsibility;

public class PersonalFilter implements Filter {

    @Override
    public boolean isSpam(Message message) {
        return message.getText().contains("casino");
    }
}
