package com.demo.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.demo.Service.UserService;
import com.demo.dao.UserDao;
import com.demo.model.User;

public class UserServiceTest {

    private static class MockUserDao implements UserDao {
        private List<User> users = new ArrayList<>();

        @Override
        public void saveUserToDB(User user) {
            users.add(user);
        }

        @Override
        public User login(String username, String password) {
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            return null;
        }

        @Override
        public List<User> getAllUsers() {
            return users;
        }

        @Override
        public void updateUser(User user) {
            // Update user logic
        }

        @Override
        public void deleteUser(String username) {
            // Delete user logic
        }
    }

    @Test
    public void testRegisterUser() {
        MockUserDao userDao = new MockUserDao();
        UserService userService = new UserService(userDao);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n"); // Set delimiter to read entire lines
        String input = "username\npassword\n";
        scanner = new Scanner(input);

        User newUser = userService.registerUser(scanner);

        assertNotNull(newUser);
        // Add assertions to check if the user is registered correctly
    }

   
    @Test
    public void testViewAllUsers() {
        // Arrange
        MockUserDao userDao = new MockUserDao();
        UserService userService = new UserService(userDao);
        Scanner scanner = new Scanner(System.in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        userDao.saveUserToDB(new User("user1", "password1", "customer"));
        userDao.saveUserToDB(new User("user2", "password2", "admin"));

        // Act
        userService.viewAllUsers();

        // Assert
        String expectedOutput = "User [username=user1, password=password1, role=customer, status=false]\n" +
                                "User [username=user2, password=password2, role=admin, status=false]";
        String actualOutput = outContent.toString().trim();
        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output: " + actualOutput);
  //      assertEquals(expectedOutput, actualOutput);
    }






@Test
public void testUpdateUser() {
    // Arrange
    MockUserDao userDao = new MockUserDao();
    UserService userService = new UserService(userDao);
    Scanner scanner = new Scanner(System.in);
    String input = "username\nnewpassword\nnewrole\n";
    scanner = new Scanner(input);
    userDao.saveUserToDB(new User("username", "password", "customer"));

    // Act
    userService.updateUser(scanner);

    // Assert
    // Add assertions to check if the user is updated correctly
}

@Test
public void testDeleteUser() {
    // Arrange
    MockUserDao userDao = new MockUserDao();
    UserService userService = new UserService(userDao);
    Scanner scanner = new Scanner(System.in);
    String input = "username\n";
    scanner = new Scanner(input);
    userDao.saveUserToDB(new User("username", "password", "customer"));

    // Act
    userService.deleteUser(scanner);

    // Assert
    // Add assertions to check if the user is deleted correctly
}
    // Other test methods can follow a similar pattern
}
