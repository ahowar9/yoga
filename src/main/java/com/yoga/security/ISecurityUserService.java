package com.yoga.security;

public interface ISecurityUserService {

	String validatePasswordResetToken(long id, String token);

	
}
