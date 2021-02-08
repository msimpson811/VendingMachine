package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;



public class Log {
	
	private String fileName = "log.txt";
	private File file = new File(fileName);
	private void createNewFile() {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("File was not created");
		}
	}
	
	public void logChange() {
		
		
	}
	
	public void logFeed() {
		
	}
	
	public void logPurchase() {
		
	}
	
	
	public void print(String entry) {
		try(PrintWriter pw = new PrintWriter(file)) {
			pw.println(entry);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
		

	
}