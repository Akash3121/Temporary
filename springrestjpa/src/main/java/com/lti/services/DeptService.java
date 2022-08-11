package com.lti.services;

import java.util.List;

import com.lti.beans.Department;

public interface DeptService {
	Department addDept(Department d);
	List<Department> deptNoList();


}
