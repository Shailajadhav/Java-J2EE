package javaexample;

import java.util.*;
import java.text.*;

public class DateUtil {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("dd-mm-yyyy");
	    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
	    
	    System.out.println("Todays date in time stamp "+dt);
	    
	    String dm = sdt.format(dt);
	    String md = mdyFormat.format(dt);
	    
	    System.out.println("Coversion of date in dd-mm-yyyy =" +dm);
	    System.out.println("Conversion of date in mm-dd-yyyy =" +md);
	}

}
