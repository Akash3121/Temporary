package com.lti.jpqldemos;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class UserApp {
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

//		Query qry = em.createQuery("select e from Employee e");
//		List<Object[]> empList = qry.getResultList();
//		for( Object[] o: empList)
//		{
//			System.out.println(Arrays.toString(o));
//		}

//		Query qry = em.createQuery("select e.empId, e.empName from Employee e");
////		System.out.println(qry);
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);
//		for (Employee e : empList) {
//			System.out.println(e.getEmpId() + " " + e.getEmpName());
//		}

		// ex.2
//		TypedQuery<Employee> qry = em.createQuery("select e from Employee e",Employee.class);
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);

		// ex.3
//		TypedQuery<Employee> qry = em.createQuery("select e from Employee e where e.empName = 'Sanjay' ",Employee.class);
//		List<Employee> empList = qry.getResultList();
////		System.out.println(empList);
//		for (Employee e: empList)
//		{
//			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+ e.getEmpSal());
//		}

//		TypedQuery<Employee> qry = em.createQuery("select e from Employee e where e.empId=:pid",Employee.class);
//		qry.setParameter("pid",101);
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);
//		
//		TypedQuery<Employee> qry = em.createQuery("select e from Employee e where e.empName=:pname",Employee.class);
//		qry.setParameter("pname","Jay");
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);

		// update sal to 30K of emp - 101
//		em.getTransaction().begin();
//		Query qry = em.createQuery("update Employee e set e.empSal=:psal where e.empId=:pid");
//		qry.setParameter("psal", 30000.00);
//		qry.setParameter("pid", 101);
//		int noRec = qry.executeUpdate();
////		List<Employee> empList = qry.getResultList();
//		System.out.println(noRec);
//		em.getTransaction().commit();

		// Ex 7: find out total salary of all employees
		// type - 1 using getSingleResult
//		Query qry = em.createQuery("select sum(e.empSal) from Employee e");
//		double r = (double) qry.getSingleResult();
////		List<Employee> empList= qry.getResultList();
//		System.out.println(r);
		// Type 2 - getResultList
//		Query query = em.createQuery("select sum(e.empSal) from Employee e");
//        System.out.println("Total Salary" + query.getResultList());

		// Ex:8 Named Query
//		Query qry = em.createNamedQuery("find emp by id");
//		qry.setParameter("pid",101);
//		List<Employee> empList = qry.getResultList();
//		System.out.println(empList);

		// Ex:9 Pagination - select Limited records

//		List<Employee> empList = em.createQuery("Select e from Employee e").setFirstResult(4).setMaxResults(4)
//				.getResultList();
//		System.out.println(empList);
		
		//Ex:10 Joins
		Query qry = em.createQuery("select e.empName,a.city from Employee e JOIN e.address a where e.address=1111");
		List<Object[]> myArray = qry.getResultList();
		for(Object[] o:myArray)
		{
			System.out.println(Arrays.toString(o));
		}

	}
}
