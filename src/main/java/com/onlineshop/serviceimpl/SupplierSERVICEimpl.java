package com.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.DAO.SupplierDAO;
import com.onlineshop.Model.Supplier;

import com.onlineshop.service.Supplierservice;
@Service
public class SupplierSERVICEimpl implements Supplierservice {
@Autowired
SupplierDAO sdao;	
public void addSupplier(Supplier sobj)
    {
		sdao.addSupplier(sobj);
	}
public String retrieveSupplier()
    {
	   return sdao.retrieveSupplier();
    }
public void deleteSupplier(int id) {
	sdao.deleteSupplier(id);
	
}
public Supplier fetchSupplierById(int id)
{
	
	return sdao.fetchSupplierById(id);
}
public void updateSupplier(Supplier Sobj) {
	sdao.updateSupplier(Sobj);
	
}
public void setStatus(int id, String status) {
	sdao.setStatus(id,status);
	
}



}
