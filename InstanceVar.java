package javaexample;

public class InstanceVar {

	public String name;
	private int marks;
	
	public InstanceVar(String sname){
		name = sname;
	}
	
	public void setMarks(int smarks){
		marks =smarks;
	}
	
	public void displayInfo(){
		System.out.println("Name of Student ="+ name);
		System.out.println("marks of student ="+ marks);
	}
	
	public static void main(String args[]){
		InstanceVar I =new InstanceVar("Ankit");
		I.setMarks(80);
		I.displayInfo();
		
	}
}
