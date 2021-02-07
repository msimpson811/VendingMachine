package com.techelevator;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachineUser {
    
	Scanner scan = new Scanner(System.in);
	
	VendingMachine vendor = new VendingMachine();
	
	public VendingMachineUser() {
	}
	
	
	
	

	public void startMenu(){
		
	String input;
    String input2;
	int inputNum;
	int inputNum2;
	
	while (true) {
	mainMenu();
	do{
	System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
	input = scan.nextLine();
	inputNum = Integer.parseInt(input);
	}while (inputNum <1 || inputNum> 3);
	
	
	if (inputNum == 1) {
		displayInventory();
	}
	if (inputNum == 2) {
	purchaseMenu();
	System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
	input2 = scan.nextLine();
	inputNum2= Integer.parseInt(input2);
		if (inputNum2 == 1) {
			feedMoney();
		}
		else if (inputNum2 == 2) {
			// method purchase
		}
		else if (inputNum2 == 3) {
			// finish transaction method
		}
	}
	if (inputNum == 3) {
		System.out.println("\nThank you for using Vendo-Matic 900! Have a nice day :-)");
		System.exit(0);
	}
 
   
}
	}
	
	public void displayInventory() {
        VendingMachine vend = new VendingMachine(); 
		
		
		for(String k : vend.getItems().getStock().keySet()) {
			Item i = vend.getItems().getStock().get(k);
			System.out.println(i.getSlot() + " " + i.getName() + " $" + i.getPrice() + " Quantity: " + i.getQuantity());
			
			
		}
	
	}
	
	public void mainMenu() { 
       
    	System.out.println("\n(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
    }
    
    public void purchaseMenu() {
    	System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
    }
    public void firstSelection() {
    	String input;
    	int inputNum;
    	do{
    		System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
    		input = scan.nextLine();
    		inputNum = Integer.parseInt(input);
    		}while (inputNum <1 || inputNum> 3);
    }

	public void feedMoney() {
		 double totalMoney = 0;
		 double moneyNum = 0;
		 String money;
		 
		
		 
		do{
	    	totalMoney += moneyNum;
	    
	    	System.out.print("\nEnter money in whole dollar amounts (Enter 0 When Finished) : $ ");
	      	money = scan.nextLine();
			moneyNum = Double.parseDouble(money);  
	    	} while(moneyNum >= 1 );
		    
		    DecimalFormat df2 = new DecimalFormat("#.00");
		    
    	    System.out.println("\nCurrent Money Provided $" + df2.format(totalMoney) + "\n");
    	    BigDecimal total = new BigDecimal(totalMoney);
    	    purchaseItem(total);
    	   
    	    }
	
	 public void purchaseItem(BigDecimal total) {
		 String itemSelect = "";
		 displayInventory();
		 int quantity = 0;
		 BigDecimal balance = null;
		 String select;
		 
		 System.out.print("\nPlease Select an Item: ");
		 
		 itemSelect = scan.nextLine();
		 
		 vendor.getItems().getStock().get(itemSelect).getPrice();
		 quantity = vendor.getItems().getStock().get(itemSelect).getQuantity();
		 
		
		 if (quantity ==0){
			 System.out.println("SOLD OUT - Please Choose Another Item.");
		 }
		 else if (quantity >= 1){
		 vendor.getItems().getStock().get(itemSelect).decreaseQuantity();
		 System.out.println("Qauntity remains :" + vendor.getItems().getStock().get(itemSelect).getQuantity());
	     
		 balance = total.subtract(vendor.getItems().getStock().get("A1").getPrice());
 	    
 	     
 	     
 	     } 
		 finishTransaction(balance);
		
		
	}
	 
	 public void finishTransaction(BigDecimal balance) {
		  
		  double totalAmt = balance.doubleValue();
		 
		  
		  double quarter = 0.25;
	      double nickel = 0.05;
	      double dime = 0.10;
	      
	     
	      double changeDue = ( (double)((int) Math.round((totalAmt)*100)) / 100.0 );
	      double modQuarters = ( (double)((int) Math.round((changeDue % quarter)*100)) / 100.0 );
	      double modDimes = ( (double)((int) Math.round((modQuarters % dime)*100)) / 100.0 );
	      double modNickels = ( (double)((int) Math.round((modQuarters % nickel)*100)) / 100.0 );
	      
	      
	      int numQuarters = (int)((changeDue - modQuarters) / (quarter));
	      int numDimes = (int)((modQuarters - modDimes) / (dime));
	      int numNickels = (int)((modDimes - modNickels) / (nickel));
	      
	      System.out.println("\nYou Change is :$" + changeDue);
	      System.out.println("Number of Quarters:  " + numQuarters);
	      System.out.println("Number of Dimes: : " + numDimes);
	      System.out.println("Number of Nickels: " + numNickels);
   		   
	 }

}	
	
    
