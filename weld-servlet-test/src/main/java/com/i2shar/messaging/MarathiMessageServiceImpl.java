package com.i2shar.messaging;

import javax.inject.Named;

/**
 * Created by Tushar on 9/22/16.
 */
@Named("marathi")
public class MarathiMessageServiceImpl implements MessageService {
    public String getGreeting(String message) {
        return "नमस्कार " + message + "!";
    }
}