package bank;

import java.util.Scanner;

// User class remains unchanged
class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

// UserRegistration class remains unchanged
class UserRegistration {
    private static Scanner sc = new Scanner(System.in);

    public static User registerUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter role (admin/customer): ");
        String role = sc.nextLine();
        return new User(username, password, role);
    }
}

// BankDetails class remains unchanged
class BankDetails {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return true;
        }
        return false;
    }
}

public class BankingApp {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // Create an array to store bank details
        BankDetails[] C;
        // Variable to store the currently logged in user
        User currentUser = null;

        // Initial menu options
        int option;
        do {
            System.out.println("1. User registration");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    // User Registration
                    System.out.println("User Registration:");
                    User newUser = UserRegistration.registerUser();
                    System.out.println("User registered successfully!");
                    break;
                case 2:
                    // User Login
                    System.out.println("User Login:");
                    currentUser = login();
                    if (currentUser != null) {
                        System.out.println("Login successful. Welcome, " + currentUser.getUsername() + "!");
                        // If login successful, exit the loop
                        option = 0; // set option to 0 to exit the loop
                    } else {
                        System.out.println("Login failed. Invalid username or password.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (option != 0); // Exit the loop if option is 0 (login successful)

        // Create initial accounts after user login
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        C = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }

        // Display menu options after login
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by Account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 5);
    }

    // Login method
    private static User login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        // Dummy check, replace with actual authentication logic
        if ("admin".equals(username) && "password".equals(password)) {
            return new User(username, password, "admin");
        }
        return null;
    }
}
