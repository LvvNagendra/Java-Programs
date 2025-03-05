package com.demo.dao;

import java.util.List;

import com.demo.model.User;

public interface UserDao {
	void saveUserToDB(User user);

	User login(String username, String password);

	List<User> getAllUsers();

	void updateUser(User user);

	void deleteUser(String username);
}
