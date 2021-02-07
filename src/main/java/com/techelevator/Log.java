package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Log {
	
	
	private File output = new File("log.txt");
		
		
		
	public void purchaseLog(Timestamp time, Item logItem, BigDecimal startBal, BigDecimal endBal) {
		time = new Timestamp(System.currentTimeMillis());
		
		
		
	}

}
