package javaexample;

public class StudentInfo {
	
	int age;
	
	public StudentInfo(String Name){
		System.out.println("Name of Student="+ Name);
		
	}
	
	void setAge(int sage)
	{
		age =sage;
			
	}
	public int getAge()
	{
		System.out.println("Age of student=" +age);
		return age;
	}
	
	
	public static void main(String args[]){
		
		StudentInfo sf = new StudentInfo("Shaila");
		sf.setAge(26);
		sf.getAge();
	}

}
