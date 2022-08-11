package com.lti.springdemo.spring_1basics;

import java.util.Iterator;
import java.util.List;

public class Employee {
	
	private String empName;
	private Address address;
//	private List<String> phoneNos;
//	
//	public void displayInfo() {
//		System.out.println(empName + " : " + "phone nos are :");
//
//		Iterator<String> itr = phoneNos.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
//	
//	public List<String> getPhoneNos() {
//		return phoneNos;
//	}
//
//	public void setPhoneNos(List<String> phoneNos) {
//		this.phoneNos = phoneNos;
//	}

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
