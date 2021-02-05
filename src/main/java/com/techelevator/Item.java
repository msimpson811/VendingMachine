package com.techelevator;

import java.math.BigDecimal;

public class Item {
	private String name;
	private BigDecimal price;
	private String slot;
	
	
	public Item(String slot, String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		this.slot = slot;
	}
	
	public String toString(){
		return slot + name + price;
	}
	

	public String getName() {
		return name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public String getSlot() {
		return slot;
	}

}
