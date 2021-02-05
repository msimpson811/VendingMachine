package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Item {
	private String muchies;

	public Chips(String slot, String name, BigDecimal price) {
		super(slot, name, price);
	
	}

	public String getMuchies() {
		return "Crunch";
	}
	

}
