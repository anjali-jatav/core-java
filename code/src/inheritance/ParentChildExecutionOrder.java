package inheritance;

public class ParentChildExecutionOrder extends ParentExecutionOrder {
	static int a1=10;
	String s="Anjali";
	static double d1=20.5d;
	int b1=m2();
	
	static {
		System.out.println("first static block of child  class" );
	}
	
	public void m1() {
		System.out.println(s + " " + "1 method of child class");
	}
	
	static {
		System.out.println("second static block of child class" + " " + a1);
	}
	
	{
		System.out.println("block 1 of child class");
	}
	
	public static int m2() {
		System.out.println(d1 + " "+ "2 static method of child class");
		return 20;
	}
	
	{
		System.out.println(" block 2 of child class" + " " + b1);
	}
	
	 public ParentChildExecutionOrder() {
		System.out.println("constructor of child class");
	}
	void m3() {
		System.out.println(b1);
	}
	

	public static void main(String[] args) {
		ParentExecutionOrder p=new ParentExecutionOrder();
		p.m1();
		p.m3();
		
		}
	
	
	


}
