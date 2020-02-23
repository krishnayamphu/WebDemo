package com.aptech.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/dashboard")
public class DashboardController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        PrintWriter pw = response.getWriter();

        if (session == null) {
            request.getRequestDispatcher("login").forward(request, response);
        } else {
            String user = (String) session.getAttribute("user");
            if (user == null) {
                request.getRequestDispatcher("login").forward(request, response);
            } else {
                request.getRequestDispatcher("dashboard.jsp").forward(request, response);
            }
        }
    }
}
