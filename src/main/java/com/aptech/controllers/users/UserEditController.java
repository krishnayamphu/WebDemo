package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/user/edit")
public class UserEditController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);

        UserDao.updateUser(user);
        response.sendRedirect("http://localhost:8080/webdemo/users");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<User> singleUser = UserDao.getUser(id);

        request.setAttribute("singleUser", singleUser);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }
}
