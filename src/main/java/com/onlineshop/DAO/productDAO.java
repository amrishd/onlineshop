package com.onlineshop.DAO;

import com.onlineshop.Model.products;

public interface productDAO {
	void addProduct(products probj);
	String retrieveProducts();
    products fetchProductById(int id);
	void deleteProduct(int id);
     void updateProduct(products produ);
    // String fetchAllproduct();
     void setProductsstatus(int id,String status);
}
