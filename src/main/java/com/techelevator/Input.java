package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		String path = "vendingmachine.csv";
		File newFile = new File(path);
		try(Scanner fileScan = new Scanner(newFile)){
			while (fileScan.hasNextLine()) {
				String line = fileScan.nextLine();
				String[] split = fileScan.nextLine().split("\\|");
				System.out.println(Arrays.toString(split));
				
			}
		}catch (FileNotFoundException e) {
			
		}
				
		
		

	}

}
