package com.onlineshop.DAO;

import com.onlineshop.Model.UserCredentials;


public interface UserCredentialsDAO {
	void addUserCredential(UserCredentials uc);
	String retrieveUserCredentials();
	

}
