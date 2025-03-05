package com.demo.daoImpl;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.dao.UserDao;
import com.demo.model.User;
import com.demo.util.DbConnection;
public class UserDaoImpl implements UserDao {
	private static final String CHECK_LOGIN_SQL = "SELECT * FROM users WHERE username = ? AND password = ? AND status = true";
	private static final String BLOCK_USER_SQL = "UPDATE users SET status = false WHERE username = ?";

	
    private static final String GET_ALL_USERS_SQL = "SELECT * FROM users";
    private static final String UPDATE_USER_SQL = "UPDATE users SET password = ?, role = ? WHERE username = ?";
    private static final String DELETE_USER_SQL = "DELETE FROM users WHERE username = ?";

    private static final int MAX_FAILED_ATTEMPTS = 3; // Maximum allowed failed login attempts
    private Map<String, Integer> failedLoginAttempts = new HashMap<>(); // Map to store failed attempts for each user


    public void saveUserToDB(User user) {
        try (Connection con = DbConnection.getConnection()) {
            // Validate password format (if needed)
            boolean hasMinimumLength = user.getPassword().length() >= 8;
            boolean hasUpperCase = !user.getPassword().equals(user.getPassword().toLowerCase());
            boolean hasLowerCase = !user.getPassword().equals(user.getPassword().toUpperCase());
            boolean hasDigit = user.getPassword().matches(".*\\d.*");
            boolean hasSpecialCharacter = user.getPassword().matches(".*[^a-zA-Z0-9].*");

            if (!(hasMinimumLength && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter)) {
                System.out.println("Error: Password does not meet the required format criteria.");
                return;
            }

            // Encrypt password
            String encryptedPassword = encryptPassword(user.getPassword());

            String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, encryptedPassword); // Store encrypted password
            pstmt.setString(3, user.getRole());
            pstmt.executeUpdate();
            System.out.println("User registered in database successfully!");
        } catch (Exception e) {
            System.out.println("Error saving user to database: " + e.getMessage());
        }
    }


    private String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            System.out.println("Error encrypting password: " + e.getMessage());
            return null;
        }
    }


//    public User login(String username, String password) {
//        User user = null;
//        try (Connection connection = DbConnection.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(CHECK_LOGIN_SQL)) {
//            preparedStatement.setString(1, username);
//            preparedStatement.setString(2, encryptPassword(password)); // Encrypt provided password
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                user = new User(resultSet.getString("username"),
//                        resultSet.getString("password"),
//                        resultSet.getString("role"));
//            }
//        } catch (SQLException e) {
//            System.out.println("Error during login: " + e.getMessage());
//        }
//        return user;
//    }
    public User login(String username, String password) {
        User user = null;
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CHECK_LOGIN_SQL)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, encryptPassword(password));
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                boolean userStatus = resultSet.getBoolean("status");
                if (userStatus) {
                    user = new User(resultSet.getString("username"),
                            resultSet.getString("password"),
                            resultSet.getString("role"));
                } else {
                    System.out.println("User " + username + " is blocked due to account status.");
                }
            } else {
                int attempts = failedLoginAttempts.getOrDefault(username, 0);
                attempts++;
                failedLoginAttempts.put(username, attempts);
                if (attempts >= MAX_FAILED_ATTEMPTS) {
                    blockUser(username); // Block user if login attempts exceed the limit
                }
            }
        } catch (SQLException e) {
            System.out.println("Error during login: " + e.getMessage());
        }
        return user;
    }

    private void blockUser(String username) {
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(BLOCK_USER_SQL)) {
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
            System.out.println("User " + username + " has been blocked due to multiple failed login attempts.");
        } catch (SQLException e) {
            System.out.println("Error while blocking user: " + e.getMessage());
        }
    }



//    private void blockUser(String username) {
//        // Logic to block the user (e.g., update user status in database)
//        System.out.println("User " + username + " is blocked due to multiple unsuccessful login attempts.");
//        // Additional logic to update user status in the database or store the blocked status
//    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS_SQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("role")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error getting all users: " + e.getMessage());
        }
        return users;
    }

    public void updateUser(User user) {
        try (Connection connection = DbConnection.getConnection()) {
            // Validate password format (if needed)
            boolean hasMinimumLength = user.getPassword().length() >= 8;
            boolean hasUpperCase = !user.getPassword().equals(user.getPassword().toLowerCase());
            boolean hasLowerCase = !user.getPassword().equals(user.getPassword().toUpperCase());
            boolean hasDigit = user.getPassword().matches(".*\\d.*");
            boolean hasSpecialCharacter = user.getPassword().matches(".*[^a-zA-Z0-9].*");

            if (!(hasMinimumLength && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter)) {
                System.out.println("Error: Password does not meet the required format criteria.");
                return;
            }

            // Encrypt password
            String encryptedPassword = encryptPassword(user.getPassword());

            // Update user with encrypted password
            String UPDATE_USER_SQL = "UPDATE users SET password = ?, role = ? WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_SQL)) {
                preparedStatement.setString(1, encryptedPassword); // Store encrypted password
                preparedStatement.setString(2, user.getRole());
                preparedStatement.setString(3, user.getUsername());
                int updatedRows = preparedStatement.executeUpdate();
                if (updatedRows > 0) {
                    System.out.println("User updated successfully!");
                } else {
                    System.out.println("User not found or update failed.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error updating user: " + e.getMessage());
        }
    }

    public void deleteUser(String username) {
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_SQL)) {
            preparedStatement.setString(1, username);
            int deletedRows = preparedStatement.executeUpdate();
            if (deletedRows > 0) {
                System.out.println("User deleted successfully!");
            } else {
                System.out.println("User not found or delete failed.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting user: " + e.getMessage());
        }
    }
}
