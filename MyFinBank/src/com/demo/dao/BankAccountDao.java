package com.demo.dao;

import java.util.List;

import com.demo.model.BankAccounts;

public interface BankAccountDao {
	void insert(BankAccounts bankDetails);

	void updateBalance(BankAccounts bankDetails);

	void delete(String accno);

	List<BankAccounts> getAllAccounts();

	BankAccounts getByAccno(String accno);
}
