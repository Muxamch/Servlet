package com.servlettest;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

public class MyServlet extends HttpServlet {
    public MyServlet(){

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        try {
            if(request.getParameter("name") != null){
                writer.println(request.getParameter("name"));
            }
        } finally {
            writer.close();
        }
    }
}

