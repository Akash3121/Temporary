package com.lti.service;

import java.util.List;

import com.lti.beans.Product;
import com.lti.dao.ProductDao;
import com.lti.dao.ProductDaoImpl;
import com.lti.excep.ProductException;

//waiter //service layer - should call Dao(cheff)
public class ProductServiceImpl implements ProductService {

	ProductDao dao = new ProductDaoImpl();

	@Override
	public int addProduct(Product p) {

		System.out.println("service layer add method called");
		int prdId = dao.addProduct(p);

		return prdId;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		System.out.println("service layer");
		List<Product> prdList = dao.getProductList();
		
		return prdList;
	}

	@Override
	public Product getProductById(int id) {
		System.out.println("in service layer");
		Product p = dao.getProductById(id);
		return p;
	}

	@Override
	public void updateProductCost(int pid, double pCost) throws ProductException{
		// TODO Auto-generated method stub
		System.out.println("in service layer");
		dao.updateProductCost(pid, pCost);
		
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("in service layer");
		dao.deleteProduct();
		
	}

}
