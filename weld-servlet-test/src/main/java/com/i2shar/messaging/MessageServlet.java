package com.i2shar.messaging;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tushar on 1/17/15.
 */
public class MessageServlet extends HttpServlet {

    @Inject
    @Named("marathi")
    private MessageService messageService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write(messageService.getGreeting("jello bilo"));
    }
}

