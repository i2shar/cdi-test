package com.i2shar.service;

/**
 * Created by Tushar on 9/22/16.
 */
public class SimpleEchoService implements EchoService {

    public String echo(String message) {
        return message;
    }
}
