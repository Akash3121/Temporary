package com.lti.reldemo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPT_OTM")
public class Department {
	
	@Id
	@Column(name="DEPID")
	private int deptId;
	
	@Column(name="DEPTNAME")
	private String deptName;

	@OneToMany(mappedBy="department")
	private List<Employee> empList;
	
	public Department(int deptId, String deptName, List<Employee> empList) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.empList = empList;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department() {
		super();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	
}
