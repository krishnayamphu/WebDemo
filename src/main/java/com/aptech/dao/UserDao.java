package com.aptech.dao;

import com.aptech.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.aptech.dbhelper.ConnectDatabase.connect;

public class UserDao {
    //save user
    public static void saveUser(User user) {
        Connection con = connect();
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO users (username,password) VALUES (?,?)");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            int staus = ps.executeUpdate();
            System.out.println("Data Saved");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // show all users
    public List<User> getAllUsers() {
        Connection con = connect();
        List<User> allUsers = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setCreatedAt(rs.getString("created_at"));
                user.setUpdatedAt(rs.getString("updated_at"));

                allUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allUsers;
    }

    //get single user
    public static List<User> getUser(int id) {
        Connection con = connect();
        List<User> singleUser = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setCreatedAt(rs.getString("created_at"));
                user.setUpdatedAt(rs.getString("updated_at"));

                singleUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return singleUser;
    }

    //update user
    public static void updateUser(User user) {
        Connection con = connect();
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE users SET username=?,password=? WHERE id=?");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getId());
            ps.executeUpdate();

            System.out.println("Data Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete user
    public static void deleteUser(User user) {
        Connection con = connect();
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id=?");
            ps.setInt(1, user.getId());
            ps.executeUpdate();

            System.out.println("Data Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*Authenticating user login*/
    public int login(String username, String password) {
        int count = 0;
        Connection con = connect();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
