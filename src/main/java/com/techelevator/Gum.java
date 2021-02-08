package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {
	
	String sound;
	
	
	public Gum(String slot, String name, BigDecimal price) {
		
		super(slot, name, price);
		
	
	}

@Override
	public String getSound() {
		
		return "Chew Chew, Yum!!!!";
	}

	

   
}