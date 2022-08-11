package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
//import javax.transaction.Transactional;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Employee;
import com.lti.excep.EmpExcep;

@Repository
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addEmployee(Employee e) {

		System.out.println("dao layer");
		em.persist(e);
		return e.getEmpNo();
	}

	@Override
	public Employee findEmpById(int id) {
		System.out.println("Dao layer find by id");

		return em.find(Employee.class, id);
	}

	@Override
	public List<Employee> findEmpList() {
		TypedQuery<Employee> qry = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> empList = qry.getResultList();
		return empList;
	}

	@Override
	@Transactional
	public boolean updateEmpName(int eId, String eName) throws EmpExcep {
		
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, eId);
		e.setEmpName(eName);
		em.merge(e);
		System.out.println(e);
		em.getTransaction().commit();
		return true;
	}

	@Override
	@Transactional
	public boolean updateEmp(Employee e) {
		// TODO Auto-generated method stub
		em.merge(e);
		return true;
	}

	@Override
	public boolean delete(Employee e) {
		// TODO Auto-generated method stub
		em.remove(e);
		return true;
	}

}
