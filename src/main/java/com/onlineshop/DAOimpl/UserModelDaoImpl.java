package com.onlineshop.DAOimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.onlineshop.DAO.UserModelDAO;
import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;
@Repository
public class UserModelDaoImpl implements UserModelDAO {
@Autowired

SessionFactory sf;
	public void AddUser(UserModel um) {
		Session s=sf.openSession();
	    Transaction tran=s.beginTransaction();
	    s.save(um);
	    tran.commit();
	    s.flush();
	    s.close();
		

	}

	public String retrieveUser() {
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

	public UserCredentials getUser(String username) {
		
		Session session = sf.openSession();
		Query qry = session.createQuery("From UserCredentials u WHERE u.userName=:username");
		qry.setParameter("username", username);
		UserCredentials use;
		try 
		{
			Object o = qry.uniqueResult();
			if ( o == null)
				return null;
			else
			{
				use = (UserCredentials)o;
				return use;
			}
		}
		catch(Exception e)
		{return null;}
	}

	public UserModel getUserModel(String username) {
		
		System.out.println(username +"-----------------");
		Session session = sf.openSession();
		Query qry = session.createQuery("From UserModel u WHERE u.username=:username");
		qry.setParameter("username", username);
		UserModel usem = (UserModel)qry.uniqueResult();
		
		System.out.println(usem.getUser_name());
		return usem;
		
	}

}
