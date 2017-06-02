package com.onlineshop.service;

import com.onlineshop.Model.Category;

public interface CategoryService {
public void addCategory(Category cat);
String retrieveCategory();
void deleteCategory(int id);
Category fetchCategoryById(int id);
void updateCategory(Category cat);
void setCategorystatus(int id,String status);
}
