package com.lti.user;

import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import com.lti.beans.Product;
import com.lti.excep.ProductException;
import com.lti.service.ProductService;
import com.lti.service.ProductServiceImpl;

public class UserApp {
	public static void main(String[] args) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
//		EntityManager em = factory.createEntityManager();
		
		ProductService service = new ProductServiceImpl();

		
		//CRUD - create, retrieve, update, delete
		
		//1 create
//		Product p = new Product(104,"Docker",6000);
//		ProductService service = new ProductServiceImpl();
//		int prdId = service.addProduct(p);
//		
//		System.out.println("product registered with id "+ prdId);
//		
		//2 retrieve - get records - select statement
		
//		List<Product> userList = service.getProductList();
//		System.out.println("user gets list" + userList);
		
		//3 search by id
//		Product p = service.getProductById(102);
//		//find(product.class,102);
//		System.out.println("record found"+p);
		
		//4 update
//		try {
//		service.updateProductCost(109,3600);	
//		}
//		catch (ProductException e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("in user updated"+bool);
		
//		5 delete
//		service.deleteProduct();
		//-------------------------------------
		//search product cost - user input id
		
		//serachCostById(101)
		//---------------------------------------
		//create another class supplier
		//suppId, suppName, suppAdd
		
		//one product - many supplier
		//101 Mobile 50K  - s101
		//102 Charger 6K  - s201
		//103 Keyboard 4K - s301
		//search productBySupplier(301)
		
		
		
		
		
		
		
	}

}
