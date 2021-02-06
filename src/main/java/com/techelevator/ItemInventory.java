package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemInventory {
	public Map<String, Item> stock;
	
	public Map<String, Item> getStock() {
		return stock;
	}

	

	public ItemInventory() {

	stock = new LinkedHashMap<String, Item>();
	String path = "vendingmachine.csv";
	File inputFile = new File(path);
	try(Scanner scanner = new Scanner(inputFile)){
		while(scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			String[] info = currentLine.split("\\|");
			String slot = info[0];
			if (info[3].contains("Chip")) {
				Chips chip = new Chips(info[1], new BigDecimal(info[2]));
				stock.put(slot, chip);
			} else if (info[3].contains("Drink")) {
				Drinks drink = new Drinks(info[1], new BigDecimal(info[2]));
				stock.put(slot, drink);
			} else if (info[3].contains("Gum")) {
				Gum gum = new Gum(info[1], new BigDecimal(info[2]));
				stock.put(slot, gum);
			} else if (info[3].contains("Candy")) {
				Candy candy = new Candy(info[1], new BigDecimal(info[2]));
				stock.put(slot, candy);
			} else {
				System.out.println("Error");
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	 {
		
	}
}

	


	
	
	
	
	

}
