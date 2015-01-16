package javaexample;

import java.util.Scanner;

public class StringToNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

			String str1 ;

			System.out.println("Enter a string");

			// Taking String input from the user
			try{
			str1=sc.nextLine();


			// String conversion to the float

			int a = Integer.parseInt(str1);
			
			System.out.println("Value of string to number ="+a);
			}
			catch(NumberFormatException e){
				System.out.println(e.getMessage());
			}

			 

	}

			}


