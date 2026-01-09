package com.Capgemini.OOPS.Inheritance;

public class Address {
    int doorno;
    int pincode;
    String street;
    String district;
    String state;
    String country;
	public Address(int doorno, int pincode, String street, String district, String state, String country) {
		this.doorno = doorno;
		this.pincode = pincode;
		this.street = street;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	void display() {
		System.out.println("address: "+"doorNo: "+doorno+"Pincode: "+pincode+"Street: "+street
				+"District: "+district+"State: "+state+"Country: "+country);
	}
}
