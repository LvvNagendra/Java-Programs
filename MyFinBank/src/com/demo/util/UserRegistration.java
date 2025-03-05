package com.demo.util;

import java.util.Scanner;

import com.demo.daoImpl.UserDaoImpl;
import com.demo.model.User;

public class UserRegistration {

    public static User registerUser(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        System.out.print("Enter role (admin/customer): ");
        String role = sc.next();
        return new User(username, password, role);
    }

    public static User login(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        // Now use the UserDao to verify login credentials
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao.login(username, password);
    }
}


