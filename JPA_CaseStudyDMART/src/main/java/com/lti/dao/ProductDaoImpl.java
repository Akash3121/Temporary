package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.beans.Product;
import com.lti.dbutil.DbUtil;
import com.lti.excep.ProductException;

import oracle.net.aso.e;

public class ProductDaoImpl implements ProductDao {

	EntityManager em = DbUtil.getEntityManager();

	@Override
	public int addProduct(Product p) {

		System.out.println("dao layer add method called");

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

		return p.getPrdId();
	}

	@Override
	public List<Product> getProductList() {
		System.out.println("Dao layer");
		em.getTransaction().begin();
//		em.find(Product.class, *)
		// JPQL - rules - use class name not table name // create alias

		Query qry = em.createQuery("select p from Product p");
		List<Product> prdList = qry.getResultList();
		// SSystem.out.println("list of products"+prdList);

		em.getTransaction().commit();

		return prdList;

	}

	@Override
	public Product getProductById(int id) {

		System.out.println("in dao layer");
		em.getTransaction().begin();
		Product p = em.find(Product.class, id);
		em.getTransaction().commit();

		return p;
	}

	@Override
	public void updateProductCost(int pId, double pCost) throws ProductException {
		// way 1: search product, set new cost, merge
			System.out.println("DAO layer");
			em.getTransaction().begin();
			Product pfind = em.find(Product.class, pId);
//			System.out.println(pfind);
			if (pfind!=null)
			{
			pfind.setPrdCost(pCost);
			em.merge(pfind);
			em.getTransaction().commit();
			System.out.println("Updated successfully");
			}
			else
			{
				throw new ProductException("product not found");
			}

//		em.getTransaction().begin();
//		Product p = em.find(Product.class, pid);
//		p.setPrdCost(pCost);
//		em.merge(p);
//		System.out.println("product updated");
//		em.getTransaction().commit();
			// way 2: use JPQL update query
//		System.out.println("in dao layer");
//		em.getTransaction().begin();
//		Query query = em.createQuery(
//			      "UPDATE Product p SET p.prdCost = :pCost "+ 
//							"WHERE p.prdId = :pid");
//		query.setParameter(100,pCost);
//		query.setParameter(103,pid);
//		int updateCount = query.executeUpdate();
//		em.getTransaction().commit();
//		System.out.println("in DAO updated count = " + updateCount);
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("in dao layer");
		em.getTransaction().begin();
		System.out.println("before remove");
		em.remove(104);
		System.out.println("after remove");
		em.getTransaction().commit();
		System.out.println("removed");

	}

}
