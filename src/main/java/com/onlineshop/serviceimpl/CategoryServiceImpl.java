package com.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.DAO.CategoryDAO;
import com.onlineshop.Model.Category;
import com.onlineshop.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired
CategoryDAO catdao;
	public void addCategory(Category cat) {
		catdao.addCategory(cat);

	}
	public String retrieveCategory()
	{
	   return catdao.retrieveCategory();
	}
	public void deleteCategory(int id)
	{
		catdao.deleteCategory(id);
		
	}
	public Category fetchCategoryById(int id) {
		
		return catdao.fetchCategoryById(id);
	}
	public void updateCategory(Category cat) {
		catdao.updateCategory(cat);
		
	}
	public void setCategorystatus(int id, String status) {
		catdao.setCategorystatus(id, status);
		
	}

}
