package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Department;

@Repository
public class DeptDaoImpl implements DeptDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public Department addDept(Department d) {
		
		em.persist(d);
		return d;
	}

	@Override
	public List<Department> deptNoList() {
		// TODO Auto-generated method stub
		Query qry=em.createQuery("Select d.deptNo from Department d");
        List<Department> deptList=qry.getResultList();
        return deptList;
	}

}
