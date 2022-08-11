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
		
//		Department d1= new Department();
//		d1.setDeptId(112);
//		d1.setDeptName("SALES");
//		
//		Employee e = new Employee();
//		e.setEmpId(103);
//		e.setEmpName("Vijay");
//		e.setEmpSal(70000);
//		e.setDepartment(d1);
//		
//		em.getTransaction().begin();
//		em.persist(e);
//		em.getTransaction().commit();
//		
//		Employee e = em.find(Employee.class, 101);
//		System.out.println(e.getDepartment().getDeptName());
		
		Department d= em.find(Department.class, 111);
		System.out.println(d.getEmpList());
		
		em.close();
		factory.close();
	}
}
