package com.aptech.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/cookieset")
public class CookieSetController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie ck = new Cookie("user", "Admin");
        ck.setMaxAge(60 * 60);
        response.addCookie(ck);

        PrintWriter printWriter = response.getWriter();
        printWriter.print("Cookie added.");
    }
}
