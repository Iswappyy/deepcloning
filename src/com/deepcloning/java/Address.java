package com.deepcloning.java;

public class Address implements Cloneable {
      String city;
      String country;
      int pin;
      
     public Address () {
    	 
     }
	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
      
	protected Object clone()throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	
      
}
