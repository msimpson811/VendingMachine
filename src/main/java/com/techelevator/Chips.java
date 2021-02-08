package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Item {

	public Chips(String slot, String name, BigDecimal price) {
		super(slot, name, price);
	
	}

	@Override
	public String getSound() {
		
		return "Crunch Crunch, Yum!!!!";
	}
	

}
