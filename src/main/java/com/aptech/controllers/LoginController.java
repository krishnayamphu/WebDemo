package com.aptech.controllers;

import com.aptech.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        userDao.getAllUsers();

        int status = userDao.login(username, password);

        if (status == 1) {
            HttpSession session = request.getSession();
            session.setAttribute("user", "Admin");
            response.sendRedirect("http://localhost:8080/webdemo/dashboard");
        } else {
            String msg = "Invalid username or password.";
            request.setAttribute("errMsg", msg);
            request.getRequestDispatcher("auth/login.jsp")
                    .include(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("auth/login.jsp")
                .forward(request, response);
    }
}
