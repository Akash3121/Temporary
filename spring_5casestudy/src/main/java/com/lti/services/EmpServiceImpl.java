package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.beans.Employee;
import com.lti.dao.EmpDao;
import com.lti.excep.EmpExcep;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao dao;

	@Override
	public int addEmployee(Employee e) {
		System.out.println("inside dao layer" + e);
		System.out.println("service layer");
		return dao.addEmployee(e);
	}

	@Override
	public Employee findEmpById(int id) {
		System.out.println("Service layer find by id");
		return dao.findEmpById(id);
	}

	@Override
	public List<Employee> findEmpList() {
		return dao.findEmpList();
	}

	@Override
	public boolean updateEmpName(int eId, String eName) throws EmpExcep {
		Employee e = dao.findEmpById(eId);
		if (e == null) {
			throw new EmpExcep("not exist");
		} else {

			return dao.updateEmpName(eId, eName);
		}
	}

}
