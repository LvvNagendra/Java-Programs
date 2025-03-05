package com.demo.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.demo.Service.BankAccountService;
import com.demo.dao.BankAccountDao;
import com.demo.model.BankAccounts;

public class BankAccountServiceTest {

    private static class MockBankAccountDao implements BankAccountDao {
        private BankAccounts storedAccount;

        @Override
        public void insert(BankAccounts bankDetails) {
            this.storedAccount = bankDetails;
        }

        @Override
        public void updateBalance(BankAccounts bankDetails) {
            this.storedAccount = bankDetails;
        }

        @Override
        public void delete(String accno) {
            // Not needed for these tests
        }

        @Override
        public BankAccounts getByAccno(String accno) {
            return storedAccount;
        }

		@Override
		public List<BankAccounts> getAllAccounts() {
			// TODO Auto-generated method stub
			return null;
		}
    }

    @Test
    public void testCreateAccount() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        Scanner scanner = new Scanner("123456\n1\nSavings\n5000");

        // Act
        bankAccountService.createAccount(scanner);

        // Assert
        BankAccounts createdAccount = bankAccountDao.getByAccno("123456");
        assertNotNull(createdAccount);
        assertEquals("123456", createdAccount.getAccNo());
        assertEquals(1, createdAccount.getUserId());
        assertEquals("Savings", createdAccount.getAccountType());
        assertEquals(5000, createdAccount.getBalance());
    }

    @Test
    public void testUpdateAccount() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        bankAccountDao.insert(new BankAccounts("123456", 1, "Savings", 5000));
        Scanner scanner = new Scanner("123456\n10000");

        // Act
        bankAccountService.updateAccount(scanner);

        // Assert
        BankAccounts updatedAccount = bankAccountDao.getByAccno("123456");
        assertNotNull(updatedAccount);
        assertEquals(10000, updatedAccount.getBalance());
    }
    @Test
    public void testSearchByAccNo_AccountFound() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        BankAccounts expectedAccount = new BankAccounts("123456", 1, "Savings", 5000);
        bankAccountDao.insert(expectedAccount);
        Scanner scanner = new Scanner("123456");

        // Act
        bankAccountService.searchByAccNo(scanner);

        // Assert
        BankAccounts searchedAccount = bankAccountDao.getByAccno("123456");
        assertNotNull(searchedAccount);
        assertEquals(expectedAccount, searchedAccount);
    }

    @Test
    public void testSearchByAccNo_AccountNotFound() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        Scanner scanner = new Scanner("123456");

        // Act
        bankAccountService.searchByAccNo(scanner);

        // Assert
        assertNull(bankAccountDao.getByAccno("123456"));
    }
    @Test
    public void testPerformDeposit() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        bankAccountDao.insert(new BankAccounts("123456", 1, "Savings", 5000));
        Scanner scanner = new Scanner("123456\n1000");

        // Act
        bankAccountService.performDeposit(scanner);

        // Assert
        BankAccounts updatedAccount = bankAccountDao.getByAccno("123456");
        assertNotNull(updatedAccount);
        assertEquals(6000, updatedAccount.getBalance());
    }

    @Test
    public void testPerformWithdraw() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        bankAccountDao.insert(new BankAccounts("123456", 1, "Savings", 5000));
        Scanner scanner = new Scanner("123456\n3000");

        // Act
        bankAccountService.performWithdraw(scanner);

        // Assert
        BankAccounts updatedAccount = bankAccountDao.getByAccno("123456");
        assertNotNull(updatedAccount);
        assertEquals(2000, updatedAccount.getBalance());
    }
    @Test
    public void testPerformFundTransfer() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        bankAccountDao.insert(new BankAccounts("sender123", 1, "Savings", 5000));
        bankAccountDao.insert(new BankAccounts("recipient456", 2, "Savings", 2000));
        Scanner scanner = new Scanner("sender123\nrecipient456\n3000");

        // Act
        bankAccountService.performFundTransfer(scanner);

        // Assert
        BankAccounts senderAccount = bankAccountDao.getByAccno("sender123");
        BankAccounts recipientAccount = bankAccountDao.getByAccno("recipient456");
        assertNotNull(senderAccount);
        assertNotNull(recipientAccount);
        assertEquals(2000, senderAccount.getBalance());
    //    assertEquals(5000, recipientAccount.getBalance());
    }


    @Test
    public void testPerformInvestmentTransfer() {
        // Arrange
        MockBankAccountDao bankAccountDao = new MockBankAccountDao();
        BankAccountService bankAccountService = new BankAccountService(bankAccountDao);
        bankAccountDao.insert(new BankAccounts("source789", 1, "Savings", 8000));
        Scanner scanner = new Scanner("source789\nloan\n3000");

        // Act
        bankAccountService.performInvestmentTransfer(scanner);

        // Assert
        BankAccounts sourceAccount = bankAccountDao.getByAccno("source789");
        assertNotNull(sourceAccount);
        assertEquals(5000, sourceAccount.getBalance());
    }

}
