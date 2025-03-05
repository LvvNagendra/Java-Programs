package com.demo.Service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.model.User;
import com.demo.util.UserNotFoundException;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    // Method to register a new user
    public User registerUser(Scanner sc) {
        try {
            System.out.println("User Registration:");
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            // Assuming all registered users are customers
            User newUser = new User(username, password, "customer");
            userDao.saveUserToDB(newUser);
            System.out.println("User registered successfully!");
            return newUser;
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("User registration failed! Please try again later.");
            return null;
        }
    }

    // Method to login a user
    public User loginUser(Scanner sc) {
        try {
            System.out.println("User Login:");
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            User loggedInUser = userDao.login(username, password);
            if (loggedInUser != null) {
                System.out.println("Login successful!");
            } else {
                throw new UserNotFoundException("Invalid username or password!");
            }
            return loggedInUser;
        } catch (UserNotFoundException e) {
            // Handle user not found exception
            System.out.println(e.getMessage());
            return null;
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("Login failed! Please try again later.");
            return null;
        }
    }

    // Method to view all users
    public void viewAllUsers() {
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Method to update a user
    public void updateUser(Scanner sc) {
        try {
            System.out.println("Enter username of user to update: ");
            String username = sc.next();
            System.out.println("Enter new password: ");
            String newPassword = sc.next();
            System.out.println("Enter new role: ");
            String newRole = sc.next();
            userDao.updateUser(new User(username, newPassword, newRole));
            System.out.println("User updated successfully!");
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("Failed to update user! Please try again later.");
        }
    }

    // Method to delete a user
    public void deleteUser(Scanner sc) {
        try {
            System.out.println("Enter username of user to delete: ");
            String username = sc.next();
            userDao.deleteUser(username);
            System.out.println("User deleted successfully!");
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("Failed to delete user! Please try again later.");
        }
    }
}
