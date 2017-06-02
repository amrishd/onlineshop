package com.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.DAO.UserCredentialsDAO;
import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;
import com.onlineshop.service.UserCredentialService;
@Service
public class UserCredentialSerImpl implements UserCredentialService, UserCredentialsDAO {
@Autowired
UserCredentialsDAO userdao;
public void addUserCredential(UserCredentials uc) 
{
	userdao.addUserCredential(uc);
	
}
	
	public String retrieveUserCredentials() {
		
		return userdao.retrieveUserCredentials();
	}

	

	

	

}
