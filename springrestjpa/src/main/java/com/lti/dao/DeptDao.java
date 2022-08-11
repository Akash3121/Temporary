package com.lti.dao;

import java.util.List;

import com.lti.beans.Department;

public interface DeptDao {
	Department addDept(Department d);
	List<Department> deptNoList();
}
