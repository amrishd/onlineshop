package com.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.DAO.UserModelDAO;
import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;
import com.onlineshop.service.UserModalService;
@Service
public class UserModelSerImpl implements UserModalService {
@Autowired
UserModelDAO usedao;
	public void AddUser(UserModel um) 
	{
       usedao.AddUser(um);

	}

	public String retrieveUser() 
	{
	
		return usedao.retrieveUser();
	}

	public UserCredentials getUser(String username) {
		return usedao.getUser(username);
		
	}

	public UserModel getUserModel(String username) {
		
		return usedao.getUserModel(username);
	}

}
