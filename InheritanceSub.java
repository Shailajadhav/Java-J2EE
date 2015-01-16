package javaexample;

public class InheritanceSub extends InheritanceSuper {

	/**
	 * @param args
	 */
	public void Add(int a ,int b){
		//super.Add(10, 50);
		super.no1 =a;
		super.no2 =b;
		System.out.println("Substraction = "+(a-b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*InheritanceSuper st = new InheritanceSuper();
		st.Add(10, 50);
		InheritanceSub sub = new InheritanceSub();
		sub.Add(10,20);*/
		InheritanceSuper tt = new InheritanceSub();
		tt.Add(50, 40);
		
	}

}
