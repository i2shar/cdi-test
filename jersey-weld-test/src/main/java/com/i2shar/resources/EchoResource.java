package com.i2shar.resources;

import com.i2shar.annotations.Stuttering;
import com.i2shar.service.EchoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Tushar on 9/22/16.
 */
@Path("echo")
public class EchoResource {

    @Inject @Stuttering
    private EchoService echoService;

    @GET
    @Path("/{message}")
    public String echo (@PathParam("message") String message) {
        return echoService.echo(message);
    }
}

