package com.zephyr.security;

public class AuthenticationException extends RuntimeException {
    private static final long serialVersionUID = -3003554580471197028L;

	public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
