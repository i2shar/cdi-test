package com.i2shar.messaging;

/**
 * Created by Tushar on 1/16/15.
 */

public class MessageServiceImpl implements MessageService {

    public MessageServiceImpl() {
    }

    @Override
    public String getGreeting(String message) {
        return "Hello " + message;
    }
}
