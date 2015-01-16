package javaexample;

public class StaticVar {

	public static int studentAge;
	
	public static final String BRANCH ="Information Technology";
	
	public static void main(String args[]){
		studentAge = 28;
		System.out.println("Age of student= "+ studentAge +" "+ "having"+" " + BRANCH +" " + "Branch");
	}
	
}
