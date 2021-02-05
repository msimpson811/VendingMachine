package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachineDemo {

	public static void main(String[] args) {
		
		String input;
		String input2;
		String money;
		String loopAgain = "YES";
		String productSelect;

		int inputNum;
		int inputNum2;
		double moneyNum = 0;
		int count = 0;
	
		double totalMoney = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (loopAgain.equalsIgnoreCase("yes")) {
		
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		do{
		System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
		input = scan.nextLine();
		inputNum = Integer.parseInt(input);
		}while (inputNum <1 || inputNum> 3);
		
		
		if (inputNum == 1) {
			System.out.println("****THIS WILL DISPLAY ITEMS****");
		}
		
	    if (inputNum == 2) {
	        
	    	
	    	System.out.println("(1) Feed Money");
			System.out.println("(2) Select Product");
			System.out.println("(3) Finish Transaction");
			do{
				System.out.print("\nPlease Enter The Number Of Your Selection: --> ");
				input2 = scan.nextLine();
				inputNum2 = Integer.parseInt(input2);
			}while (inputNum2 <1 || inputNum2> 3);
			
			if (inputNum2 == 1) {
	    	do{
	    	totalMoney += moneyNum;
	    	count++;
	    	System.out.print("\nEnter money in whole dollar amounts (Enter 0 When Finished) : $ ");
	      	money = scan.nextLine();
			moneyNum = Double.parseDouble(money);  
	    	} while(moneyNum >= 1 );
			
	    	DecimalFormat df2 = new DecimalFormat("#.00");
	    	System.out.println("\nCurrent Money Provided $" + df2.format(totalMoney));
	    	System.out.println("(2) Select Product ");
	    	productSelect = scan.nextLine();
	    	
	    	
	    	
			}
			
			else if (inputNum2 == 2) {
				System.out.println("WILL PASS SELECTION TO SOME ITEM CLASS");
			}
			else if (inputNum2 == 3) {
				System.out.println("WILL PASS SELECTION TO SOME METHOD OR CLASS ");
			}
			
	}
	    	    	
		if (inputNum == 3) {
			System.out.println("\n*****Thank you for using Vendo-Matic 800!  Have a nice day :-)*****");
			System.exit(0);
		}
		System.out.print("\nEnter \"yes\" To Make Another Selection:--> ");
		loopAgain = scan.nextLine();

	}

}
}

