package com.onlineshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshop.Model.Category;
import com.onlineshop.Model.Supplier;
import com.onlineshop.Model.products;
import com.onlineshop.service.Supplierservice;

@Controller
public class SupplierController {
	
	@Autowired
	Supplierservice supser;
	
	@RequestMapping("/Supplier")
	public ModelAndView manage()
	{
		ModelAndView mvc = new ModelAndView("Supplier","ms",new Supplier());
		String suplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist",suplist);
		return mvc;
	}
	
	@RequestMapping(value="/SaveSupplier",method=RequestMethod.POST)
	public ModelAndView addSupplier(Supplier sobj) 
	{
		supser.addSupplier(sobj);
		ModelAndView mvc=new ModelAndView("Supplier","ms",new Supplier());
	    String suplist=supser.retrieveSupplier();
		mvc.addObject("Supplierlist", suplist);
		return mvc;
	}
	
	@RequestMapping(value="deleteSupplier",method=RequestMethod.GET)
	public ModelAndView deleteSupplier(@RequestParam("supplier_id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
	{
		supser.deleteSupplier(id);//("supplier_id")int supplier_id should match with deleteProduct(supplier_id)
		ModelAndView mvc= new ModelAndView("Supplier","ms",new Supplier());
		String suplist =supser.retrieveSupplier();
		mvc.addObject("Supplierlist",suplist);
		return mvc;
	}
	
	@RequestMapping(value="fetchSupplierById", method=RequestMethod.GET)
	public ModelAndView fetchSupplierById(@RequestParam("supplier_id")int id)
	{
		    Supplier supobj= supser.fetchSupplierById(id);
		    ModelAndView mvc=new ModelAndView("Supplier","ms",supobj);
			String suplist = supser.retrieveSupplier();
			mvc.addObject("Supplierlist",suplist);
			mvc.addObject("clicktoUpdateSupplier", true);//should match with <c:when test="${clicktoUpdateSupplier==true}"> so that it displays the form
			return mvc;
	}
	
	@RequestMapping(value="updateSupplier",method=RequestMethod.POST)
	public ModelAndView updateSupplier(Supplier sobj)
	{
		 supser.updateSupplier(sobj);
	 	  ModelAndView mvc=new ModelAndView("Supplier","ms",new Supplier());
	       String suplist=supser.retrieveSupplier();
	 		mvc.addObject("Supplierlist",suplist);
	 		mvc.addObject("clicktoUpdateSupplier","true");
	 		return mvc;
	 	
	}
	

@RequestMapping(value="Enabble",method=RequestMethod.GET)
public ModelAndView enable(@RequestParam("supplier_id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
{
    String status="Enabble";
    
	supser.setStatus(id, status);
	ModelAndView mvc=new ModelAndView("Supplier","ms",new Supplier());
	String suplist=supser.retrieveSupplier();
	mvc.addObject("Supplierlist",suplist);
	return mvc;
	
}
@RequestMapping(value="Disabble",method=RequestMethod.GET)
public ModelAndView disable(@RequestParam("supplier_id")int id)// the requestparam(id) should be same as href of the manageproduct delete?id
{
    String status="Disabble";
    supser.setStatus(id, status);
    ModelAndView mvc=new ModelAndView("Supplier","ms",new Supplier());
	String suplist=supser.retrieveSupplier();
	mvc.addObject("Supplierlist",suplist);
	return mvc;
	
	
}


}
