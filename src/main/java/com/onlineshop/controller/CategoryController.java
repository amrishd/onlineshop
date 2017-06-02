package com.onlineshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.onlineshop.Model.Category;
import com.onlineshop.Model.Supplier;
import com.onlineshop.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService catser;
	static int count=1;
	String cat_name;
	String categorytype;
	@RequestMapping("/Category")
	public ModelAndView category()
	{
		ModelAndView mvc=new ModelAndView("Category","cat",new Category());
		String categorylist=catser.retrieveCategory();
		mvc.addObject("categolist",categorylist);
		return mvc;
		
	}
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public ModelAndView addcategory(Category cat)
	{
		
	    if(count!=0 && cat_name !=cat.getCategoryname() && categorytype !=cat.getCategorytype())
		{
			catser.addCategory(cat);
			count=0;
			cat_name=cat.getCategoryname();
			categorytype=cat.getCategorytype();
			
		}
		ModelAndView mvc=new ModelAndView("Category","cat",new Category());
		String categorylist=catser.retrieveCategory();
		mvc.addObject("categolist",categorylist);
		count=1;
		return mvc;
		
	}
    

@RequestMapping(value="/deleteCategory",method=RequestMethod.GET)
	public ModelAndView deletecategory(@RequestParam("id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
	{
		catser.deleteCategory(id);
		ModelAndView mvc=new ModelAndView("Category","cat",new Category());
		String categorylist = catser.retrieveCategory();
		mvc.addObject("categolist",categorylist);
		return mvc;
	}

 @RequestMapping(value="fetchCategoryById",method=RequestMethod.GET)
	public ModelAndView fetchCategorybyid(@RequestParam("id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
	{
	    Category catobj= catser.fetchCategoryById(id);
	    ModelAndView mvc=new ModelAndView("Category","cat",catobj);
		String categorylist = catser.retrieveCategory();
		mvc.addObject("categolist",categorylist);//prodlist should match with  ${prodlist}
		mvc.addObject("catlistupdate", true);//should match with <c:when test="${prolistupdate==true}"> so that it displays the form
		return mvc;
		
	}

@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public ModelAndView Updatecategory(Category cat)// 
	{
	    catser.updateCategory(cat);
	    ModelAndView mvc=new ModelAndView("Category","cat",new Category());
		String categorylist = catser.retrieveCategory();
		mvc.addObject("categolist",categorylist);//prodlist should match with  ${prodlist}
		return mvc;
		
	}

@RequestMapping(value="Enable",method=RequestMethod.GET)
public ModelAndView enable(@RequestParam("id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
{
    String status="Enable";
    
	catser.setCategorystatus(id, status);
	ModelAndView mvc=new ModelAndView("Category","cat",new Category());
	String categorylist = catser.retrieveCategory();
	mvc.addObject("categolist",categorylist);//prodlist should match with  ${prodlist}
	return mvc;
	
}
@RequestMapping(value="Disable",method=RequestMethod.GET)
public ModelAndView disable(@RequestParam("id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
{
    String status="Disable";
    
	catser.setCategorystatus(id, status);
	ModelAndView mvc=new ModelAndView("Category","cat",new Category());
	String categorylist = catser.retrieveCategory();
	mvc.addObject("categolist",categorylist);//prodlist should match with  ${prodlist}
	return mvc;
	
}


}
