package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputFile {
	public static void main(String[] args) {
		
		
		
		
	}
	
		
	public List<String> listOfAllItems(){		
		List<String> inputItems = new ArrayList<>();
	  String path = "vendingmachine.csv";
	  File inputFile = new File(path);
	  
		  try(Scanner scan = new Scanner(inputFile)) {
			while (scan.hasNextLine()) {
				inputItems.add(scan.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found :(");
		}
		return inputItems;
		}
		
	
	
	
		public Map<String, Item> mapOfItems() { // takes the list of items, splits it and returns information in a map.
			HashMap<String, Item> itemMap = new HashMap<>();
			for (String items : listOfAllItems()) {
				String[] splitItems = items.split("\\|");
				String slot = splitItems[0];
				String type = splitItems[3];
					if(splitItems[3].equals("Chip")) {
						Chips chips = new Chips(splitItems[0], splitItems[1], new BigDecimal(splitItems[2]));
					} 
					else if(splitItems[3].equals("Candy")) {
						Candy candies = new Candy(splitItems[0], splitItems[1], new BigDecimal(splitItems[2]));
					}		
					else if(splitItems[3].equals("Drink")) {
						Drinks drinks = new Drinks(splitItems[0], splitItems[1], new BigDecimal(splitItems[2]));
					} 
					else if(splitItems[3].equals("Gum")) {
						Gum gum = new Gum(splitItems[0], splitItems[1], new BigDecimal(splitItems[2]));
						System.out.println(gum);
					}
				}
			
				return itemMap;
			}
		
	  }


	


