package com.demo.model;

 public class User {
    @Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + ", status=" + status + "]";
	}

	private String username;
    private String password;
    private String role;
    private boolean status;

    public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
}

