package com.demo.util;



public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("User not found!");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
