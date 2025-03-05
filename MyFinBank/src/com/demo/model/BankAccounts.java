package com.demo.model;

public class BankAccounts {
    private String accNo;
    private int userId;
    private String accountType;
    private long balance;

    public BankAccounts(String accNo, int userId, String accountType, long balance) {
        this.accNo = accNo;
        this.userId = userId;
        this.accountType = accountType;
        this.balance = balance;
    }

   

	public BankAccounts() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccounts [accNo=" + accNo + ", userId=" + userId + ", accountType=" + accountType + ", balance=" + balance + "]";
    }
}
