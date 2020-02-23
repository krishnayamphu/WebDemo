package com.aptech.test;

import com.aptech.dao.UserDao;
import com.aptech.models.User;

import java.util.List;

public class userTest {
    int x;

    public static void main(String[] args) {
        userTest userTest = new userTest();
        userTest.x = 5;

        UserDao userDao = new UserDao();
        List<User> allUsers = userDao.getAllUsers();

        for (User u : allUsers) {
            System.out.println(u.getId() + "-" + u.getUsername());
        }

//        int status = userDao.login("admin", "a1234");
//        if (status == 1) {
//            System.out.println("Welcome");
//        } else {
//            System.out.println("Invalid ussername or password.");
//        }

    }

    public void info() {
        x = 5;
    }
}
