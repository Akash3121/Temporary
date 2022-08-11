package com.lti.dao;

import java.util.List;

import com.lti.beans.Product;
import com.lti.excep.ProductException;

public interface ProductDao {
	
	public abstract int addProduct(Product p);
	public abstract List<Product> getProductList();
	public abstract Product getProductById(int id);
	public abstract void updateProductCost(int pid, double pCost)throws ProductException;
	public abstract void deleteProduct();

}
