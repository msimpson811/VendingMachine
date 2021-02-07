package com.techelevator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
	
	private String fileName = "log.txt";
	private File logFile = new File(fileName);

	public Log() {
		createNewFile();
	}

	private void createNewFile() {
		try {
			logFile.createNewFile();
		} catch (IOException e) {
			System.out.println("File was not created");
		}
	}

	private String getCurrentTime() {
		String date;
		String newDate = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(date);
		return newDate;
	}

	public String logEvent(String event, String balanceBeforeTransaction, String afterTransaction) {
		String logString = String.format("%-24s %-22s %-14s %-14s", getCurrentTime(), event, balanceBeforeTransaction,
				afterTransaction);

		try (Writer fileWriter = new FileWriter(logFile, true);
				BufferedWriter buffered = new BufferedWriter(fileWriter)) {
			buffered.write(logString);
		} catch (IOException e) {
		}
		return logString;

	}
}