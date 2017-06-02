package com.onlineshop.service;

import com.onlineshop.Model.products;



public interface productservice {
	
	
	void addProduct(products probj);
    String  retrieveProducts();
    products fetchProductById(int id);
    void deleteProduct(int id);
    void updateProduct(products produ);
    void setProductsstatus(int id,String status);
}
