package com.onlineshop.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class products {
	@Id
	@GeneratedValue

	private int productid;
	private String pdname;
	private float price;
	private String desc;
	private int size;
	private int discount;
	private int qty;
	String productsstatus;
	private int supplier_id;
	private int cat_id;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getProductsstatus() {
		return productsstatus;
	}
	public void setProductsstatus(String productsstatus) {
		this.productsstatus = productsstatus;
	}
	@Transient
	 MultipartFile product_img;
	public void products()
	{
		
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getPdname() {
		return pdname;
	}
	public void setPdname(String pdname) {
		this.pdname = pdname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public MultipartFile getProduct_img() {
		return product_img;
	}
	public void setProduct_img(MultipartFile product_img) {
		this.product_img = product_img;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	
		
}
