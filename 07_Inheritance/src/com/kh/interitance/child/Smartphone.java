package com.kh.interitance.child;

import com.kh.interitance.parent.Product;

public class Smartphone extends Product {
	
	
	
	private String mobileAgency;

	public Smartphone() {
		
	}

	public Smartphone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return super.toString() + " Smartphone [mobileAgency=" + mobileAgency + "]";
	}
	

}
