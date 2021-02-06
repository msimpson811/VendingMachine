package com.techelevator;

public class test {

	public static void main(String[] args) {
		VendingMachine vend = new VendingMachine(); 
		
		System.out.println(vend.getItems().getStock().keySet());
		for(String k : vend.getItems().getStock().keySet()) {
			Item i = vend.getItems().getStock().get(k);
			System.out.println(i.getName() + " $" + i.getPrice() + " Quantity:" + i.getQuantity());
		}
	}

}
