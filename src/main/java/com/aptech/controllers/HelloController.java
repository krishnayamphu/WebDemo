package com.aptech.controllers;

import com.aptech.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/hello")
public class HelloController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "Admin";
        String emp[] = {"Ram", "Sita", "Hari"};

        Student s1 = new Student("Ramesh", 19);
        Student s2 = new Student("Sita", 18);
        Student s3 = new Student("Manita", 17);

        List<Student> stdList = new ArrayList<>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);

        //setAttribute method
        request.setAttribute("user", user);
        request.setAttribute("employees", emp);
        request.setAttribute("stdList", stdList);


        RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
        rd.forward(request, response);
    }
}
