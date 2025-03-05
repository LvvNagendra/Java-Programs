package com.demo.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.dao.BankAccountDao;
import com.demo.model.BankAccounts;

public class BankAccountDaoImpl implements BankAccountDao {

    private static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

//    public void insert(BankAccounts bankDetails) {
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            String query = "INSERT INTO bankaccount (accno, userid, acc_type, balance) VALUES (?, ?, ?, ?)";
//            PreparedStatement pstmt = connection.prepareStatement(query);
//            pstmt.setString(1, bankDetails.getAccNo());
//            pstmt.setString(2, bankDetails.getUserId());
//            pstmt.setString(3, bankDetails.getAccountType());
//            pstmt.setLong(4, bankDetails.getBalance());
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    public void insert(BankAccounts bankDetails) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            // Check if the user exists in the users table
            if (!isUserExists(connection, bankDetails.getUserId())) {
                System.out.println("User does not exist");
                return; // Exit method if user does not exist
            }

            String query = "INSERT INTO bankaccount (accno, userid, acc_type, balance) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, bankDetails.getAccNo());
            pstmt.setInt(2, bankDetails.getUserId());
            pstmt.setString(3, bankDetails.getAccountType());
            pstmt.setLong(4, bankDetails.getBalance());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean isUserExists(Connection connection, int userId) throws SQLException {
        String query = "SELECT COUNT(*) FROM users WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, userId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // User exists if count is greater than 0
                }
            }
        }
        return false; // Return false if query fails or user count is 0
    }

    public void updateBalance(BankAccounts bankDetails) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "UPDATE bankaccount SET balance = ? WHERE accno = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setLong(1, bankDetails.getBalance());
            pstmt.setString(2, bankDetails.getAccNo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String accno) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM bankaccount WHERE accno = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, accno);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 // In BankAccountDao class

    public List<BankAccounts> getAllAccounts() {
        List<BankAccounts> accounts = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM bankaccount";
            PreparedStatement pstmt = connection.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BankAccounts account = new BankAccounts();
                account.setAccNo(rs.getString("accno"));
                account.setUserId(rs.getInt("userid"));
                account.setAccountType(rs.getString("acc_type"));
                account.setBalance(rs.getLong("balance"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public BankAccounts getByAccno(String accno) {
        BankAccounts account = null;
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM bankaccount WHERE accno = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, accno);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                account = new BankAccounts();
                account.setAccNo(rs.getString("accno"));
                account.setUserId(rs.getInt("userid"));
                account.setAccountType(rs.getString("acc_type"));
                account.setBalance(rs.getLong("balance"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }
    

}
