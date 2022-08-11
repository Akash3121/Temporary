package com.lti.reldemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserApp {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
//		Address a1= new Address(1113,"Delhi","India");
//		Employee e1 = new Employee(103,"Vijay", 80000, a1);
//		
//		em.getTransaction().begin();
//		em.persist(e1);
//		em.getTransaction().commit();
//		em.close();
//		factory.close();
		
//		Query qry = em.createQuery("select e from Employee e where e.empId=102");
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);
//		for (Employee e: empList)
//		{
//			System.out.println(e.getEmpId() + " "+ e.getAddress().getCity());
//		}
//		
//		System.out.println("\n");
//		Query qry2 = em.createQuery("select e from Employee e where e.empName='Jay'");
//		List<Employee> empList1 = qry2.getResultList();
//		for(Employee e1: empList1)
//		{
//			System.out.println(e1.getAddress().getCountry());
//		}
//		
		Query qry1 = em.createQuery("select a from Address a where a.addId=1113");
		List<Address> addList = qry1.getResultList();
		System.out.println(addList);
		for (Address a:addList)
		{
			//can't get emp details from address - since 
			//mapping unidirectional
			System.out.println(a.getAddId()+" "+a.getEmployee().getEmpName());
		}
		
	}
}
