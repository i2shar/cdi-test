package com.i2shar.resources;

import com.i2shar.service.MessageService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Tushar on 9/22/16.
 */
@Path("test")
public class TestResource {

    @Inject
    @Named("marathi")
    private MessageService messageService;

    @GET
    public String test() {
        return messageService.getGreeting("Hello Worold!");
    }
}