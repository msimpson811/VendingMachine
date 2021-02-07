package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachineUser {
    
	Scanner scan = new Scanner(System.in);
	

	
	public VendingMachineUser() {
	}
	
	// method for inventory
	// method for purchase
	// method for finish transatcion
	

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
    	    System.out.println("\nCurrent Money Provided $" + df2.format(totalMoney));
		}
}