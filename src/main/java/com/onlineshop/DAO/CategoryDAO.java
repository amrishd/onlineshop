package com.onlineshop.DAO;

import com.onlineshop.Model.Category;

public interface CategoryDAO {
	void addCategory(Category cat);
	String retrieveCategory();
	void deleteCategory(int id);
	Category fetchCategoryById(int id);
	void updateCategory(Category cat);
	void setCategorystatus(int id,String status);
}
