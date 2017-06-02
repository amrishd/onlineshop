package com.onlineshop.DAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.onlineshop.DAO.CategoryDAO;
import com.onlineshop.Model.Category;
import com.onlineshop.Model.Supplier;
@Repository
public class CategoryDAOImpl implements CategoryDAO {
@Autowired
SessionFactory sf;
	public void addCategory(Category cat) {
		Session s=sf.openSession();
	    Transaction tran=s.beginTransaction();
	    s.save(cat);
	    tran.commit();
	    s.flush();
	    s.close();
		

	}
	public String retrieveCategory()
	{
		
		 
		 Session s = sf.openSession();
        Transaction tran = s.beginTransaction();
		List catlist = s.createQuery("FROM Category").list();
		Gson gson = new Gson();
		String jsonNames = gson.toJson(catlist);
		tran.commit();
		s.close();
		return jsonNames;
	}
	public void deleteCategory(int id) 
	{
		
        Session s = sf.openSession();
	    Transaction tran = s.beginTransaction();
	    Category catdel  = (Category) s.get(Category.class,id );
	    s.delete(catdel);
	    tran.commit();
	    s.close();
	 
     }
	public Category fetchCategoryById(int id) 
	{
		
		
	    Session s = sf.openSession();
		Transaction tran = s.beginTransaction();
		Category catlist = (Category) s.get(Category.class,id);
		tran.commit();
		s.close();
        return catlist;

	
	}
	public void updateCategory(Category cat) {
	
		Session s=sf.openSession();
		Transaction tran=s.beginTransaction();
		s.update(cat);
		tran.commit();
		s.close();
		
		
		
	}
	public void setCategorystatus(int id, String status) 
	{
		
		Session s = sf.openSession();
		Transaction tran = s.beginTransaction();
		Category catlist = (Category) s.get(Category.class,id);
		catlist.setCategorystatus(status);
		tran.commit();
		s.close();
       
	
	}

}
