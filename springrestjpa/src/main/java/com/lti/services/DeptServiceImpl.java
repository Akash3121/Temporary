package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Department;
import com.lti.dao.DeptDao;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao dao;
	
	@Override
	public Department addDept(Department d) {
		
		return dao.addDept(d);
	}

	@Override
	public List<Department> deptNoList() {
		// TODO Auto-generated method stub
		List<Department> deptList = dao.deptNoList();
		return deptList;
	}
	
	

}
