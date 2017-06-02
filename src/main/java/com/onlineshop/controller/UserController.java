package com.onlineshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshop.Model.UserCredentials;
import com.onlineshop.Model.UserModel;
import com.onlineshop.Model.products;
import com.onlineshop.service.CategoryService;
import com.onlineshop.service.Supplierservice;
import com.onlineshop.service.UserCredentialService;
import com.onlineshop.service.UserModalService;
import com.onlineshop.service.productservice;
@Controller
public class UserController 
{
	@Autowired
	UserModalService useser;
	@Autowired
	UserCredentialService ucis;
	
	
	@Autowired
	productservice proser;
	@Autowired
	Supplierservice supser;
	@Autowired
	CategoryService catser;
	
	
	@RequestMapping("/Register")
	public  ModelAndView register()
	{
		ModelAndView mvc=new ModelAndView("Register","user",new UserModel());
		return mvc;
	}

	@RequestMapping(value="/AddUser",method=RequestMethod.POST)
	public ModelAndView add(UserModel um)
	{    UserCredentials uc = new UserCredentials();
	     try{
	    	 useser.AddUser(um);
	    	 uc.setUserName(um.getUsername());
	    	 uc.setPassword(um.getUser_password());
	    	 uc.setEnabled(true);
	    	 uc.setRole("ROLE_USER");
	    	 ucis.addUserCredential(uc);
	    	 
	     }catch(Exception e){
	    	 System.out.println("the exception is"+e);
	     }
		
		ModelAndView mvc=new ModelAndView("Register","user",new UserModel());
		    String l=useser.retrieveUser();
			
		    return mvc;	


	}
	
	@RequestMapping("checkLogin")
	public ModelAndView loginCheck(@RequestParam("userName") String username ,@RequestParam("password") String password)
	{
		UserCredentials usermod = useser.getUser(username);
		if(usermod == null)
		{
			ModelAndView mav = new ModelAndView("Login" , "message" ,"Credentials Are Incorrect!");
			return mav;
		}
		UserModel usrmd  = useser.getUserModel(username);
		System.out.println(usrmd.getUser_name());
		if( username.equals(usermod.getUserName()) && password.equals(usermod.getPassword()))
		{
			if( usermod.equals("ROLE_USER"))
			{
				ModelAndView mav = new ModelAndView("index");
				return mav;
				
				
			}
			else
			{
				ModelAndView mav=new ModelAndView("manageproducts","mp",new products());
				 String productlist=proser.retrieveProducts();
					mav.addObject("prodlist", productlist);
					String supplist=supser.retrieveSupplier();
					mav.addObject("Supplierlist",supplist);
					String catlist =catser.retrieveCategory();
					mav.addObject("catlist",catlist);
					mav.addObject("Details" , usrmd);
					return mav;
			}
		}
		return null;
		
	}
	
	
	
}
