package com.lti.springdemo.spring_1basics;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("Manohar Parikar")
	private String empName;
	
	@Autowired //by default -byType
	@Qualifier("a1")
	private Address address;


	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
		System.out.println("parameterized constructor");
	}
	public Employee() {
		super();
		System.out.println("default constructor");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("empName setters");
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("address setter");
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}
	
	

}
