package com.demo.main;

import java.util.Scanner;

import com.demo.Service.BankAccountService;
import com.demo.Service.UserService;
import com.demo.daoImpl.BankAccountDaoImpl;
import com.demo.daoImpl.UserDaoImpl;
import com.demo.model.User;

public class Main2 {
    private static final UserDaoImpl userDao = new UserDaoImpl();
    private static final UserService userService = new UserService(userDao);
    private static final BankAccountDaoImpl bankAccountDao = new BankAccountDaoImpl();
    private static final BankAccountService bankAccountService = new BankAccountService(bankAccountDao);

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        User currentUser = null;

        int option;
        do {
            System.out.println("1. User registration");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            if (sc.hasNextInt()) {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        User newUser = userService.registerUser(sc);
                        // Additional logic after registration if needed
                        break;
                    case 2:
                        User loggedInUser = userService.loginUser(sc);
                        if (loggedInUser != null) {
                            System.out.println("Login successful. Welcome, " + loggedInUser.getUsername()
                                    + "  your role is " + loggedInUser.getRole() + "!");
                            handleOperations(sc, loggedInUser); // Pass loggedInUser to handleOperations
                        } else {
                            System.out.println("Login failed. Invalid username or password.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("Invalid choice! Please enter a valid number.");
                sc.next(); // Consume the invalid input
                option = 0; // Set option to 0 to prevent an infinite loop
            }
        } while (option != 3 && currentUser == null);
        sc.close();
    }

    private static void handleOperations(Scanner sc, User currentUser) {
        int option;
        do {
            if (currentUser.getRole().equals("admin")) {
                // Admin operations
                System.out.println("Welcome to the admin screen, " + currentUser.getUsername() + "!");
                System.out.println("Admin Operations:");
                System.out.println("1. View all users");
                System.out.println("2. Update user");
                System.out.println("3. Delete user");
                System.out.println("4. Create account");
                System.out.println("5. Update account");
                System.out.println("6. Delete account");
                System.out.println("7. View all bank accounts");
                System.out.println("8. Search by Account number");
                System.out.println("9. Logout");
                System.out.println("Enter your choice: ");
                // Rest of your code...
                if (sc.hasNextInt()) {
                    option = sc.nextInt();
                    switch (option) {
                        // Cases for valid choices
                        // ...
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                } else {
                    System.out.println("Invalid choice! Please enter a valid number.");
                    sc.next(); // Consume the invalid input
                    option = 0; // Set option to 0 to prevent an infinite loop
                }

                switch (option) {
                    case 1:
                        userService.viewAllUsers();
                        break;
                    case 2:
                        userService.updateUser(sc);
                        break;
                    case 3:
                        userService.deleteUser(sc);
                        break;
                    case 4:
                        // Create account
                        bankAccountService.createAccount(sc);
                        break;
                    case 5:
                        // Update account
                        bankAccountService.updateAccount(sc);
                        break;
                    case 6:
                        // Delete account
                        bankAccountService.deleteAccount(sc);
                        break;
                    case 7:
                        // View all bank accounts
                        bankAccountService.viewAccountDetails();
                        break;
                    case 8:
                        // Search by Account number
                        bankAccountService.searchByAccNo(sc);
                        break;
                    case 9:
                        System.out.println("Logging out...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid number.");
                        sc.next(); // Consume the invalid input
                        option = 0; // Set option to 0 to prevent an infinite loop
                        break;
                }
            } else {
                // User operations
                System.out.println("Welcome to My Bank, " + currentUser.getUsername() + "!");
                System.out.println("User Operations:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Fund Transfer");
                System.out.println("4. Transfer to Investment");
                System.out.println("5. View Account Details");
                System.out.println("6. Logout");
                System.out.println("Enter your choice: ");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        bankAccountService.performDeposit(sc);
                        break;
                    case 2:
                        bankAccountService.performWithdraw(sc);
                        break;
                    case 3:
                        bankAccountService.performFundTransfer(sc);
                        break;
                    case 4:
                        bankAccountService.performInvestmentTransfer(sc);
                        break;
                    case 5:
                    	bankAccountService.searchByAccNo(sc);
                        break;
                    case 6:
                        System.out.println("Logging out...");
                        break;
                    default:
                        // System.out.println("Invalid choice!");
                }
            }
        } while (option != 6);
   
}}
