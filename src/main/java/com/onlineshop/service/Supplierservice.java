package com.onlineshop.service;

import com.onlineshop.Model.Supplier;


public interface Supplierservice {
void addSupplier(Supplier sobj);
String retrieveSupplier();
void deleteSupplier(int id);
Supplier fetchSupplierById(int id);
void updateSupplier(Supplier Sobj);
void setStatus(int id,String status);

}
