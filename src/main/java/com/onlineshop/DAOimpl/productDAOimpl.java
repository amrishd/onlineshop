package com.onlineshop.DAOimpl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.onlineshop.DAO.productDAO;
import com.onlineshop.Model.Category;
import com.onlineshop.Model.products;
 @Repository
public class productDAOimpl implements productDAO {
@Autowired
SessionFactory sf;
public void addProduct(products probj)
{
	Session s=sf.openSession();
    Transaction tran=s.beginTransaction();
    s.save(probj);
    tran.commit();
    s.flush();
    s.close();
	
}
public String retrieveProducts()
{
	Session s=sf.openSession();
	Transaction tran=s.beginTransaction();
	List productlist=s.createQuery("FROM products").list();
   
	Gson gs=new Gson();	
    String jsonNames=gs.toJson(productlist);
    tran.commit();
    s.flush();
    s.close();
    return jsonNames;
}
public products fetchProductById(int id)
{
	Session s=sf.openSession();
	Transaction tran=s.beginTransaction();
	products produ=(products) s.get(products.class,id);
	
	tran.commit();
	s.close();
	return produ;
}
public void deleteProduct(int id)
{
	
	Session s=sf.openSession();
	Transaction tran=s.beginTransaction();
	products prodel=(products) s.get(products.class,id);
	s.delete(prodel);
	tran.commit();
	s.flush();
	s.close();
}
public void updateProduct(products produ)
{
	Session s=sf.openSession();
	Transaction tran=s.beginTransaction();
	s.update(produ);
	tran.commit();
	s.close();
	
}
/*
public String fetchAllproduct()
{
	Session s=sf.openSession();
	Query query=s.createQuery("From product");
	List list=(List)query.list();//storing the collection of output in list
	Gson gson= new Gson();
	String productlist= gson.toJson(list);
	s.close();
	return productlist;
}*/

public void setProductsstatus(int id, String status) {
	
	Session s = sf.openSession();
	Transaction tran = s.beginTransaction();
	products pdlist = (products) s.get(products.class,id);
	pdlist.setProductsstatus(status);
	tran.commit();
	s.close();

}
}