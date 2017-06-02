package com.onlineshop.DAO;



import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;


public interface UserModelDAO {
void AddUser(UserModel um);	
String retrieveUser();
UserCredentials getUser(String username); //gets user according to username
UserModel getUserModel(String username); //gets usermodel according to username


}
