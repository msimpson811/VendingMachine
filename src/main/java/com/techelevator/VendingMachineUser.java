package com.techelevator;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachineUser {

	Scanner scan = new Scanner(System.in);

	VendingMachine vendor = new VendingMachine();

	public VendingMachineUser() {
	}

	public void startMenu() {

		String input;
		
		int inputNum;
		

		while (true) {
			mainMenu();
			try {
			do {
				System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
				input = scan.nextLine();
				inputNum = Integer.parseInt(input);
			} while (inputNum < 1 || inputNum > 3);

			if (inputNum == 1) {
				displayInventory();
			}
			if (inputNum == 2) {
				feedMoney();				
			}
			if (inputNum == 3) {
				System.out.println("\nThank you for using Vendo-Matic 900! Have a nice day :-)");
				System.exit(0);
			}
		}catch (Exception e) {
			System.out.println("Thats not a valid input");
	}
		}
	}
    BigDecimal balance;
	String itemSelect = "";
	public void displayInventory() {
		System.out.println("\n**********VENDO-MATIC 800***********\n");
		VendingMachine vend = new VendingMachine();

		for (String k : vend.getItems().getStock().keySet()) {
			Item i = vend.getItems().getStock().get(k);
			System.out.println(i.getSlot() + " " + i.getName() + " $" + i.getPrice() + " Quantity: " + i.getQuantity());

		}

	}

	public void mainMenu() {
        System.out.println("\n******MAIN MENU*******");
		System.out.println("\n(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
	}

	public void firstSelection() {
		String input;
		int inputNum;
		do {
			System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
			input = scan.nextLine();
			inputNum = Integer.parseInt(input);
		} while (inputNum < 1 || inputNum > 3);
	}
	double totalMoney = 0;
	int moneyNum = 0;
	String money;
	public void feedMoney() {
		
	    System.out.println("\n****FEED ME SOME MONEY!****");
		
		do {
			totalMoney += moneyNum;
			;
			System.out.print("\nEnter Whole Dollar Amounts (Enter 0 When Finished) : $ ");
			money = scan.nextLine();
			moneyNum = Integer.parseInt(money);
		} while (moneyNum >= 1);
        
		DecimalFormat df2 = new DecimalFormat("#.00");

		System.out.println("\nCurrent Money Provided $" + df2.format(totalMoney)+ "\n");
		BigDecimal total = new BigDecimal(totalMoney);
		purchaseItem(total);

	}
	
	public void purchaseItem(BigDecimal total) {
		BigDecimal balance = null;
		String itemSelect = "";
		displayInventory();
		int quantity = 0;
        
		System.out.print("\nPlease Select an Item: ");

		try {
			itemSelect = scan.nextLine();
			vendor.getItems().getStock().get(itemSelect).getPrice();
			quantity = vendor.getItems().getStock().get(itemSelect).getQuantity();

			if (quantity == 0) {
				System.out.println("SOLD OUT - Please Choose Another Item.");
			} else if (quantity >= 1) {
				vendor.getItems().getStock().get(itemSelect).decreaseQuantity();
				String name = vendor.getItems().getStock().get(itemSelect).getName();
				String sound = vendor.getItems().getStock().get(itemSelect).getSound();
				System.out.println("\nYou Have Selected: ----> " + name + "!");
				System.out.println("\n---- " + sound + " ----");
				balance = total.subtract(vendor.getItems().getStock().get(itemSelect).getPrice());				
			}
		
		} catch (Exception e) {
			System.out.println("Thats not a valid input");
		}	
	
	 System.out.println("\nYour Balance: $" + balance);
     System.out.print("\nAnother Purchase?? (Y/N)" );
        try{   
        	String anotherPurchase = scan.nextLine();
        
        		if (anotherPurchase.equalsIgnoreCase("Y")) {
        			purchaseItem(balance);
        			
        		}else if (anotherPurchase.equalsIgnoreCase("N")) {
        			finishTransaction(balance);
        		}
        }catch (Exception e) {
        System.out.println("Thats not a valid input");
		} 
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
	      
	      System.out.println("\n***** THANK YOU FOR USING VENDO-MATIC 800 *****");
	      DecimalFormat df2 = new DecimalFormat("#.00");
	      System.out.println("\nYour Change is: $" + df2.format(changeDue));
	      System.out.println("\nNumber of Quarters:  " + numQuarters);
	      System.out.println("Number of Dimes: : " + numDimes);
	      System.out.println("Number of Nickels: " + numNickels);
	      
	      startMenu();
	}

}
