package javaexample;


public class ExceptionHandel {
	public static void main(String RGS[]){
	int a,d;
	try{
	 d = 0;
		a=100/d;
		System.out.println("This code will not execute as exception occure");
		
	}
catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		
		
	}finally{
		System.out.println("Always this Code will execute");

	}

}
}
