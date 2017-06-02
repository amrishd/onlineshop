package com.onlineshop.service;

import com.onlineshop.Model.UserCredentials;


public interface UserCredentialService {
	void addUserCredential(UserCredentials uc);
	String retrieveUserCredentials();
	

}
