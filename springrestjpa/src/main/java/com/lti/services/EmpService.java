package com.lti.services;

import java.util.List;

import com.lti.beans.Employee;
import com.lti.excep.EmpExcep;

public interface EmpService {
	
	int addEmployee(Employee e);
	public Employee findEmpById(int id);
	
	List<Employee> findEmpList();
	
	boolean updateEmpName(int eId, String eName) throws EmpExcep;
	boolean updateEmp(Employee e);
	boolean delete(int eId);




}
