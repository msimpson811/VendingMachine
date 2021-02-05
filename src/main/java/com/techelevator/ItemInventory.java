package com.techelevator;



public class ItemInventory {
	private int quantity = 5;
	private Item myItem = null;
	
	
	
	public ItemInventory(Item myItem, int quantity) {
		this.quantity = quantity;
		this.myItem = myItem;
	}

	
	public void inventoryCounter() {
		this.quantity = quantity - 1;	
	}
	
	
	public String getQuantity() {
		if(quantity == 0) {
			return "Sold Out :(";
		}
		return String.valueOf(quantity);
	}



	public Item getMyItem() {
		return myItem;
	}
	
	
	
	
	

}
