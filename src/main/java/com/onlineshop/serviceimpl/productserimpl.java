package com.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.DAO.productDAO;
import com.onlineshop.Model.products;
import com.onlineshop.service.productservice;
@Service

public class productserimpl implements productservice {
@Autowired
productDAO prodao;
public void addProduct(products probj)
{
	prodao.addProduct(probj);
}
public String retrieveProducts()
{
	return prodao.retrieveProducts();
	
}
public products fetchProductById(int id)
{
	return prodao.fetchProductById(id);
}
public void deleteProduct(int id)
{
	prodao.deleteProduct(id);
}
public void updateProduct(products produ) {
	prodao.updateProduct(produ);
	
}
public void setProductsstatus(int id, String status) {
	prodao.setProductsstatus(id, status);
	
}


}
