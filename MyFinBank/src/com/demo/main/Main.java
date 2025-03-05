package com.demo.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.demo.daoImpl.BankAccountDaoImpl;
import com.demo.daoImpl.UserDaoImpl;
import com.demo.model.BankAccounts;
import com.demo.model.User;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        UserDaoImpl userDao = new UserDaoImpl();
        BankAccountDaoImpl bankAccountDao = new BankAccountDaoImpl();
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
                        // User Registration
                        System.out.println("User Registration:");
                        User newUser = registerUser(sc, userDao);
                        if (newUser != null) {
                            userDao.saveUserToDB(newUser);
                            System.out.println("User registered successfully!");
                        }
                        break;
                    case 2:
                        // User Login
                        System.out.println("User Login:");
                        currentUser = loginUser(sc, userDao);
                        if (currentUser != null) {
                            System.out.println("Login successful. Welcome, " + currentUser.getUsername() + "  your role is "+currentUser.getRole() +"!");
                            // Additional operations after login
                            handleOperations(sc, userDao, bankAccountDao, currentUser);
                            currentUser = null; // Logout after operations
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
        } while (option != 3);
        sc.close();
    }

    private static User registerUser(Scanner sc, UserDaoImpl userDao) {
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        // Assuming all registered users are customers
        return new User(username, password, "customer");
    }

    private static User loginUser(Scanner sc, UserDaoImpl userDao) {
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        return userDao.login(username, password);
    }

    private static void handleOperations(Scanner sc, UserDaoImpl userDao, BankAccountDaoImpl bankAccountDao, User currentUser) {
        int option;
        do {
            if (currentUser.getRole().equals("admin")) {
                // Admin operations
            	 System.out.println("welcome to admin screen");
                System.out.println("Admin Operations:");
                System.out.println("1. View all users");
                System.out.println("2. Update user");
                System.out.println("3. Delete user");
                System.out.println("4. Create account");
                System.out.println("5. update account");
                System.out.println("6. delete account");
                System.out.println("7. View all bank accounts");
                System.out.println("8. Search by Account number");
                System.out.println("9. Logout");
                System.out.println("Enter your choice: ");
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
                        viewAllUsers(userDao);
                        break;
                    case 2:
                        updateUser(sc, userDao);
                        break;
                    case 3:
                        deleteUser(sc, userDao);
                        break;
                    case 4:
                        // Create account
                        createAccount(sc, bankAccountDao);
                        break;
                    case 5:
                        // Update account
                        updateAccount(sc, bankAccountDao);
                        break;
                    case 6:
                        // Delete account
                        deleteAccount(sc, bankAccountDao);
                        break;
                    case 7:
                        // View all bank accounts
                        viewAllBankAccounts(bankAccountDao);
                        break;
                    case 8:
                        // Search by Account number
                        searchByAccNo(sc, bankAccountDao);
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
            	 System.out.println("welcome to  my bank");
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
                        performDeposit(sc, bankAccountDao, currentUser);
                        break;
                    case 2:
                        performWithdraw(sc, bankAccountDao, currentUser);
                        break;
                    case 3:
                        performFundTransfer(sc, bankAccountDao, currentUser);
                        break;
                    case 4:
                        performInvestmentTransfer(sc, bankAccountDao, currentUser);
                        break;
                    case 5:
                        viewAccountDetails(bankAccountDao, currentUser);
                        break;
                    case 6:
                        System.out.println("Logging out...");
                        break;
                    default:
                      //  System.out.println("Invalid choice!");
                }
            }
        } while (option != 6);
    }

    private static void viewAllUsers(UserDaoImpl userDao) {
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void updateUser(Scanner sc, UserDaoImpl userDao) {
        System.out.println("Enter username of user to update: ");
        String username = sc.next();
        System.out.println("Enter new password: ");
        String newPassword = sc.next();
        System.out.println("Enter new role: ");
        String newRole = sc.next();
        userDao.updateUser(new User(username, newPassword, newRole));
    }

    private static void deleteUser(Scanner sc, UserDaoImpl userDao) {
        System.out.println("Enter username of user to delete: ");
        String username = sc.next();
        userDao.deleteUser(username);
    }

    private static void viewAllBankAccounts(BankAccountDaoImpl bankAccountDao) {
        List<BankAccounts> accounts = bankAccountDao.getAllAccounts();
        for (BankAccounts account : accounts) {
            System.out.println(account);
        }
        
    }

    private static void performDeposit(Scanner sc, BankAccountDaoImpl bankAccountDao, User currentUser) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        System.out.println("Enter amount to deposit: ");
        long amount = sc.nextLong();
        BankAccounts account = bankAccountDao.getByAccno(accNo);
        if (account != null) {
            account.setBalance(account.getBalance() + amount);
            bankAccountDao.updateBalance(account);
            System.out.println("Amount deposited successfully. Updated balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void performWithdraw(Scanner sc, BankAccountDaoImpl bankAccountDao, User currentUser) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        System.out.println("Enter amount to withdraw: ");
        long amount = sc.nextLong();
        BankAccounts account = bankAccountDao.getByAccno(accNo);
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
                bankAccountDao.updateBalance(account);
                System.out.println("Amount withdrawn successfully. Updated balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void performFundTransfer(Scanner sc, BankAccountDaoImpl bankAccountDao, User currentUser) {
        System.out.println("Enter sender account number: ");
        String senderAccNo = sc.next();
        System.out.println("Enter recipient account number: ");
        String recipientAccNo = sc.next();
        System.out.println("Enter amount to transfer: ");
        long amount = sc.nextLong();

        BankAccounts senderAccount = bankAccountDao.getByAccno(senderAccNo);
        BankAccounts recipientAccount = bankAccountDao.getByAccno(recipientAccNo);

        if (senderAccount != null && recipientAccount != null) {
            if (senderAccount.getBalance() >= amount) {
                senderAccount.setBalance(senderAccount.getBalance() - amount);
                recipientAccount.setBalance(recipientAccount.getBalance() + amount);
                bankAccountDao.updateBalance(senderAccount);
                bankAccountDao.updateBalance(recipientAccount);
                System.out.println("Fund transfer successful.");
                System.out.println("Sender's updated balance: " + senderAccount.getBalance());
                System.out.println("Recipient's updated balance: " + recipientAccount.getBalance());
            } else {
                System.out.println("Insufficient balance in sender's account!");
            }
        } else {
            System.out.println("One or both accounts not found!");
        }
    }


    private static void performInvestmentTransfer(Scanner sc, BankAccountDaoImpl bankAccountDao, User currentUser) {
        // Assuming investment transfer means transferring money to other investment categories within the same bank
        System.out.println("Enter source account number: ");
        String sourceAccNo = sc.next();
        System.out.println("Enter target investment category (loan, recurring deposits, fixed deposits): ");
        String targetCategory = sc.next();

        // Prompt user to enter a valid long value for the amount
        long amount = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter amount to transfer: ");
                amount = sc.nextLong();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Consume invalid input to avoid an infinite loop
            }
        }

        BankAccounts sourceAccount = bankAccountDao.getByAccno(sourceAccNo);

        if (sourceAccount != null) {
            // Check if the target investment category is valid
            switch (targetCategory.toLowerCase()) {
                case "loan":
                case "recurring deposits":
                case "fixed deposits":
                    // Perform the investment transfer
                    if (sourceAccount.getBalance() >= amount) {
                        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
                        bankAccountDao.updateBalance(sourceAccount);
                        System.out.println("Investment transfer successful.");
                        System.out.println("Source account's updated balance: " + sourceAccount.getBalance());
                    } else {
                        System.out.println("Insufficient funds in the source account.");
                    }
                    break;
                default:
                    System.out.println("Invalid investment category!");
                    break;
            }
        } else {
            System.out.println("Source account not found!");
        }
    }
    private static void viewAccountDetails(BankAccountDaoImpl bankAccountDao, User currentUser) {
        List<BankAccounts> accounts = bankAccountDao.getAllAccounts();
        for (BankAccounts account : accounts) {
            System.out.println(account);
        }
    }
    
    private static void createAccount(Scanner sc, BankAccountDaoImpl bankAccountDao) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        System.out.println("Enter user ID: ");
        int userId = sc.nextInt();
        System.out.println("Enter account type: ");
        String accountType = sc.next();
        System.out.println("Enter initial balance: ");
        long balance = sc.nextLong();
        BankAccounts account = new BankAccounts(accNo, userId, accountType, balance);
        bankAccountDao.insert(account);
        System.out.println("Account created successfully.");
    }

    private static void updateAccount(Scanner sc, BankAccountDaoImpl bankAccountDao) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        System.out.println("Enter new balance: ");
        long balance = sc.nextLong();
        BankAccounts account = bankAccountDao.getByAccno(accNo);
        if (account != null) {
            account.setBalance(balance);
            bankAccountDao.updateBalance(account);
            System.out.println("Account balance updated successfully.");
        } else {
            System.out.println("Account not found!");
        }
    }

    private static void deleteAccount(Scanner sc, BankAccountDaoImpl bankAccountDao) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        bankAccountDao.delete(accNo);
        System.out.println("Account deleted successfully.");
    }

    private static void searchByAccNo(Scanner sc, BankAccountDaoImpl bankAccountDao) {
        System.out.println("Enter account number: ");
        String accNo = sc.next();
        BankAccounts searchedAccount = bankAccountDao.getByAccno(accNo);
        if (searchedAccount != null) {
            System.out.println("Account found: " + searchedAccount);
        } else {
            System.out.println("Account not found!");
        }
        }
}

