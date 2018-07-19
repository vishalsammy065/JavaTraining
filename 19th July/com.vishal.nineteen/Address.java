package com.vishal.nineteen;

public class Address {
	String houseNo;
	String street;
	String city;
	
	public Address(String houseNo, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
	}



	@Override
	public String toString() {
		return "\nAddress [houseNo= " + houseNo + ", street= " + street + ", city= " + city + "]";
	}
	
}
