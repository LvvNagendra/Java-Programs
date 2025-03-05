package com.demo.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.BankAccountDao;
import com.demo.model.BankAccounts;
import com.demo.util.InvalidInputException;

public class BankAccountService {
	private final BankAccountDao bankAccountDao;

	public BankAccountService(BankAccountDao bankAccountDao) {
		this.bankAccountDao = bankAccountDao;
	}

	public void viewAccountDetails() {
		List<BankAccounts> accounts = bankAccountDao.getAllAccounts();
		accounts.forEach(System.out::println);
	}

	public void createAccount(Scanner sc) {
		try {
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
		} catch (InputMismatchException e) {
			throw new InvalidInputException("Invalid input! Please enter valid data.");
		}
	}

	public void updateAccount(Scanner sc) {
		try {
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
				throw new InvalidInputException("Account not found!");
			}
		} catch (InputMismatchException e) {
			throw new InvalidInputException("Invalid input! Please enter a valid number.");
		}
	}

	public void deleteAccount(Scanner sc) {
		try {
			System.out.println("Enter account number: ");
			String accNo = sc.next();
			bankAccountDao.delete(accNo);
			System.out.println("Account deleted successfully.");
		} catch (InputMismatchException e) {
			throw new InvalidInputException("Invalid input! Please enter a valid account number.");
		}
	}

	public void searchByAccNo(Scanner sc) {
        try {
            System.out.println("Enter account number: ");
            String accNo = sc.next();
            BankAccounts searchedAccount = bankAccountDao.getByAccno(accNo);
            if (searchedAccount != null) {
                System.out.println("Account found: " + searchedAccount);
            } else {
                System.out.println("Account not found!");
            }
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input! Please enter a valid account number.");
        }
	}
	public void performDeposit(Scanner sc) {
        try {
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
                throw new InvalidInputException("Account not found!");
            }
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input! Please enter a valid number.");
        }
    }

    // Method to perform withdrawal from an account
    public void performWithdraw(Scanner sc) {
        try {
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
                throw new InvalidInputException("Account not found!");
            }
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input! Please enter a valid number.");
        }
    }

    // Method to perform fund transfer between two accounts
    public void performFundTransfer(Scanner sc) {
        try {
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
                throw new InvalidInputException("One or both accounts not found!");
            }
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input! Please enter a valid number.");
        }
    }

    // Method to perform investment transfer from one account to another within the same bank
    public void performInvestmentTransfer(Scanner sc) {
        try {
            System.out.println("Enter source account number: ");
            String sourceAccNo = sc.next();
            System.out.println("Enter target investment category (loan, recurring, fixed): ");
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
                    case "recurring":
                    case "fixed":
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
                        throw new InvalidInputException("Invalid investment category!");
                }
            } else {
                throw new InvalidInputException("Source account not found!");
            }
        } catch (InputMismatchException e) {
            throw new InvalidInputException("Invalid input! Please enter a valid number.");
        }
    }
    
}
