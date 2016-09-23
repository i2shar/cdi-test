package com.i2shar.service;

import com.i2shar.annotations.Stuttering;

/**
 * Created by Tushar on 9/22/16.
 */
@Stuttering
public class StutteringEchoService implements EchoService {

    @Override
    public String echo(String message) {
        char[] chars = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            sb.append(aChar).append("...");
        }
        return sb.toString();
    }
}
