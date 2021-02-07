package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;

public class Item {
	private String name;
	

	private String slot;
	private BigDecimal price;
	private int quantity = 5;
	private String sound;
	
	public int decreaseQuantity() {
		quantity = quantity -1;
		return quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}



	public Item(String slot, String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		this.slot = slot;
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
   
	public String getSound() {
		return sound;
		
	}
	
}
