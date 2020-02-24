package com.aptech.controllers.users;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/user/delete")
public class UserDeleteController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = new User();
        user.setId(id);

        UserDao.deleteUser(user);
        response.sendRedirect("http://localhost:8080/webdemo/users");
    }
}
