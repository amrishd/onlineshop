package com.onlineshop.DAOimpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.onlineshop.DAO.SupplierDAO;
import com.onlineshop.Model.Supplier;
import com.onlineshop.Model.products;

@Repository
public class SupplierDAOimpl implements SupplierDAO {
@Autowired
SessionFactory sf;
	public void addSupplier(Supplier sobj) {
		
	Session s=sf.openSession();
    Transaction tran=s.beginTransaction();
    s.save(sobj);
    tran.commit();
    s.flush();
    s.close();
	
	}

	public String retrieveSupplier() 

	{
        Session s = sf.openSession();
        Transaction tran = s.beginTransaction();
		List supplierlist = s.createQuery("FROM Supplier").list();
		Gson gson = new Gson();
		String jsonNames = gson.toJson(supplierlist);
		tran.commit();
		s.close();
		return jsonNames;

	}
	public void deleteSupplier(int supplier_id)
	{
		Session s = sf.openSession();
	    Transaction tran = s.beginTransaction();
	    Supplier supdel  = (Supplier) s.get(Supplier.class,supplier_id );
	    s.delete(supdel);
	    tran.commit();
	    s.close();
	
		
	}

	public Supplier fetchSupplierById(int id) {
		Session s = sf.openSession();
		Transaction tran = s.beginTransaction();
		Supplier suplis = (Supplier) s.get(Supplier.class,id);
		tran.commit();
		s.close();

		return suplis;
	}

	public void updateSupplier(Supplier Sobj) {
		Session s=sf.openSession();
		Transaction tran=s.beginTransaction();
		s.update(Sobj);
		tran.commit();
		s.close();
		
		
	}

	public void setStatus(int id, String status) {
		
		
	
	Session s = sf.openSession();
	Transaction tran = s.beginTransaction();
	Supplier slist = (Supplier) s.get(Supplier.class,id);
	slist.setStatus(status);
	tran.commit();
	s.close();

	
	

	}
	

	}
