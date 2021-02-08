package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Item{

	public Drinks(String slot, String name, BigDecimal price) {
		super(slot, name, price);
		
	}


@Override
public String getSound() {
	
	return "Glug Glug, Yum!!!!";
}
}