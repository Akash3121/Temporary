package com.lti.jpqldemos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empjpql")
@NamedQuery(query="select e from Employee e where e.empId=:pid", name="find emp by id")
public class Employee {
	
	@Id
	@Column(name="EMPID")
	private int empId;
	@Column(name="EMPNAME",length=10)
	private String empName;
	@Column(name="EMPSAL")
	private double empSal;
	@Column(name="DESIG",length=10)
	private String desig;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Add_Id")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empId, String empName, double empSal, String desig, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.desig = desig;
		this.address = address;
	}
	public Employee(int empId, String empName, double empSal, String desig) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.desig = desig;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "\n Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", desig=" + desig + "]";
	}
	
	

}
