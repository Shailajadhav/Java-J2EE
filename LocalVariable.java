package javaexample;

public class LocalVariable {

	public void setAge(){
		int age=0;
		age =age + 7;
		System.out.println("Age of Ankit=" +age);
	}
	public static void main(String args[]){
		LocalVariable l =new LocalVariable();
		l.setAge();
	}
	
}
