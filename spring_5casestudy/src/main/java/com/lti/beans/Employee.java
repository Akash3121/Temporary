package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMP_SPRING")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "EMPSEQ")
	@SequenceGenerator(name="EMPSEQ", sequenceName = "empseq", allocationSize = 1 )
	@Column(name="EMPNO")
	private int empNo;
	
	@Column(name="EMPNAME")
	private String empName;
	
	@Column(name="EMPSAL")
	private double empSal;
	public Employee(int empNo, String empName, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

	
}
