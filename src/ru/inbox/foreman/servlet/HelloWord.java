package ru.inbox.foreman.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class HelloWord extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        try(OutputStream os = resp.getOutputStream()) {
            resp.getOutputStream().println("Hello Word");
            resp.getOutputStream().flush();
            resp.getOutputStream().close();
        } catch (IOException e) {
            System.out.println("GET error");
            e.printStackTrace();
        }
    }
}
