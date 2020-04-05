package inheritance;

public class ParentExecutionOrder {
	static int a=10;
	String s="Anjali";
	static double d=20.5d;
	int b=m2();
	
	static {
		System.out.println("first static block of parent class" );
	}
	
	public void m1() {
		System.out.println(s + " " + "1 method of parent class");
	}
	
	static {
		System.out.println("second static block of parent class" + " " + a);
	}
	
	{
		System.out.println("block 1 of parent class");
	}
	
	public static int m2() {
		System.out.println(d + " "+ "2 static method of parent class");
		return 20;
	}
	
	{
		System.out.println(" block 2 of parent class" + " " + b);
	}
	
	public ParentExecutionOrder() {
		System.out.println("constructor of parent class");
	}
	void m3() {
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		ParentExecutionOrder p=new ParentExecutionOrder();
		p.m1();
		p.m3();
		
		}

}
