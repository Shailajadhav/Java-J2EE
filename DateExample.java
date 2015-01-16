package javaexample;
import java.util.*;
import java.text.*;



public class DateExample {
	
	
	

	

	
	public static void main(String args[]) {
	// Instantiate a Date object
	Date date = new Date();

	// display time and date using toString()
	System.out.println(date.toString());
	
	 SimpleDateFormat ft = 
		       new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		       System.out.println("Current Date: " + ft.format(date));
	}
	}
	

