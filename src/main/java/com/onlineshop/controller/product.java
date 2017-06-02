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
import com.onlineshop.Model.UserModel;
import com.onlineshop.Model.products;
import com.onlineshop.service.CategoryService;
import com.onlineshop.service.Supplierservice;
import com.onlineshop.service.UserCredentialService;
import com.onlineshop.service.productservice;


@Controller
public class product {
	
	@Autowired
	productservice proser;
	@Autowired
	Supplierservice supser;
	@Autowired
	CategoryService catser;
	@Autowired
	UserCredentialService usercredser;
	static int count=1;
	static String prd_name;
	static float price;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	@RequestMapping("/Product")
	public String asd()
	{
		return "Product";
	}
	@RequestMapping("/manageproducts")
	public ModelAndView manage()
	{
		ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
		 String productlist=proser.retrieveProducts();
		mvc.addObject("prodlist", productlist);
		String supplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist",supplist);
		String catlist =catser.retrieveCategory();
		mvc.addObject("catlist",catlist);
		return mvc;
				
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView addproductmethod(products prodm) 
	{
		
		if(count!=0 && prd_name !=prodm.getPdname() && price !=prodm.getPrice())
		{
			
		proser.addProduct(prodm);
		count=0;
		prd_name=prodm.getPdname();
		price=prodm.getPrice();
		String path="D:\\project\\onlineshop\\src\\main\\webapp\\resources\\prodimg\\";
		path=path+String.valueOf(prodm.getProductid())+".jpg";
		File f=new File(path);
		MultipartFile mfile=prodm.getProduct_img();
		if(!mfile.isEmpty())
		{
			try
			{
				byte[] b=mfile.getBytes();
				FileOutputStream fos=new FileOutputStream(f);
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				bos.write(b);
				bos.close();
			}
			catch(Exception e)
			{
				System.out.println("Error in Upload"+e);
			}
		}	
			else
			{
				System.out.println("file is empty");
			}
		}
		ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
	    String productlist=proser.retrieveProducts();
		mvc.addObject("prodlist", productlist);
		String supplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist",supplist);
		String categorylist=catser.retrieveCategory();
		mvc.addObject("catlist",categorylist);
		count=1;
		return mvc;
		
	}
	
  @RequestMapping(value="deleteProduct",method=RequestMethod.GET)
  
	  public ModelAndView deleteProduct(@RequestParam("id")int id)
	  {
	              proser.deleteProduct(id);
	              ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
	              String productlist=proser.retrieveProducts();
	      		mvc.addObject("prodlist", productlist);
	      		String supplist=supser.retrieveSupplier();
	      		mvc.addObject("Supplierlist",supplist);
	      		String catlist =catser.retrieveCategory();
	      		mvc.addObject("catlist",catlist);
	    	      return mvc;
	    	
	  }
  @RequestMapping(value="fetchProductById",method=RequestMethod.GET)
	public ModelAndView updatePr(@RequestParam("product_id")int prodid)
	{  
	  products produ= proser.fetchProductById(prodid);
	  ModelAndView mvc=new ModelAndView("manageproducts","mp",produ);
      String productlist=proser.retrieveProducts();
		mvc.addObject("prodlist",productlist);
		String supplist=supser.retrieveSupplier();
  		mvc.addObject("Supplierlist",supplist);
  		String catlist =catser.retrieveCategory();
  		mvc.addObject("catlist",catlist);
	 
		
		mvc.addObject("userClickUpdateProduct","true");
		
		return mvc;
		
	}
  
  @RequestMapping(value="updateProduct",method=RequestMethod.POST)
 	public ModelAndView updateProduct( products produ)
 	{  
 	  proser.updateProduct(produ);
 	  ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
       String productlist=proser.retrieveProducts();
 		mvc.addObject("prodlist",productlist);
 		String supplist=supser.retrieveSupplier();
  		mvc.addObject("Supplierlist",supplist);
  		String catlist =catser.retrieveCategory();
  		mvc.addObject("catlist",catlist);
	 
 		mvc.addObject("userClickUpdateProduct","true");
 		return mvc;
 		
 	}
 
@RequestMapping(value="enablle",method=RequestMethod.GET)
public ModelAndView enable(@RequestParam("id")int id)
{   
	String status="enablle";
     proser.setProductsstatus(id, status);
     ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
	  String productlist=proser.retrieveProducts();
      mvc.addObject("prodlist",productlist);
      String supplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist",supplist);
		String catlist =catser.retrieveCategory();
		mvc.addObject("catlist",catlist);
   return mvc;
	
}
@RequestMapping(value="disablle",method=RequestMethod.GET)
public ModelAndView disable(@RequestParam("id")int id)
{   
	String status="disablle";
     proser.setProductsstatus(id, status);
     ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
	 String productlist=proser.retrieveProducts();
		mvc.addObject("prodlist", productlist);
		String supplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist",supplist);
		String catlist =catser.retrieveCategory();
		mvc.addObject("catlist",catlist);
		return mvc;
}


@RequestMapping("Login")
public ModelAndView loginPage()
{  ModelAndView mvc=new ModelAndView("manageproducts","mp",new products());
	return mvc;
}
}






