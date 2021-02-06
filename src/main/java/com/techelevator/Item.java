package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;

public class Item {
	private String name;
	private BigDecimal price;
	private int quantity = 5;
	
	public int decreaseQuantity() {
		quantity = quantity -1;
		return quantity;
	}
	
	public String getQuantity() {
		if (quantity == 0) {
			return "Sorry Item is sold out.";
		}
	
		return String.valueOf(quantity);
	}



	public Item(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}


	
	
}
