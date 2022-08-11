package com.lti.reldemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_OTO")
public class Address {
	
	@Id
	@Column(name="Add_Id")
	private int addId;
	
	@Column(name="CITY",length=10)
	private String city;
	
	@Column(name="COUNTRY",length=10)
	private String country;
	
	@OneToOne(mappedBy="address") //mappedBy - JPA - as bidirectional mapping//use the reference of emp
	private Employee employee;
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address() {
		super();
	}

	public Address(int addId, String city, String country, Employee employee) {
		super();
		this.addId = addId;
		this.city = city;
		this.country = country;
		this.employee = employee;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addInt=" + addId + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
