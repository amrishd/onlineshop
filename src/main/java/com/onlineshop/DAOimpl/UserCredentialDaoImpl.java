package com.onlineshop.DAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.onlineshop.DAO.UserCredentialsDAO;
import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;
@Repository
public class UserCredentialDaoImpl implements UserCredentialsDAO {
@Autowired
SessionFactory sf;
public void addUserCredential(UserCredentials uc) {
	Session s=sf.openSession();
    Transaction tran=s.beginTransaction();
    s.save(uc);
    tran.commit();
    s.flush();
    s.close();
	
	
}

	public String retrieveUserCredentials() {
		Session s=sf.openSession();
		Transaction tran=s.beginTransaction();
		List l=s.createQuery("FROM UserModel").list();
	   
		Gson gs=new Gson();	
	    String jsonNames=gs.toJson(l);
	    tran.commit();
	    s.flush();
	    s.close();
	    return jsonNames;
		
		
	}
	
	
	
}
