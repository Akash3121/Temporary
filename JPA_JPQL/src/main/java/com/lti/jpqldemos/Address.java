package com.lti.jpqldemos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	public Address(int addInt, String city, String country) {
		super();
		this.addId = addInt;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	public int getAddInt() {
		return addId;
	}
	public void setAddInt(int addId) {
		this.addId = addId;
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
