package javaexample;


public class Swapping {
	int no1,no2;
	public void Swapping(int a ,int b){
		this.no1  = a;
		this.no2 = b;
		no1 = no1+no2;
		no2 =no1-no2;
		no1 =no1-no2;
		System.out.println("First No is ="+no1);
		System.out.println("Second No is = "+no2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping s =new Swapping();
		s.Swapping(100, 200);
	}

}
