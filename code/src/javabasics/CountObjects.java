package javabasics;
/**
 * 
 * @author anjali
 *
 */
public class CountObjects {
 static int count=1;
 int a;
 int b;
 int c;
 
	CountObjects(){
		//System.out.println(count);
		//count++;

	 System.out.println(count++);
	 a=1;
	 count=20;
	 //System.out.println(count);
	 
 }
	{
		b=2;
		count=10;
	}
	{
		c=3;
		count=20;
	}
	static {
//		a=5;
		count=5;
		//System.out.println(count);
	}
	public static void main(String[] args) {
new CountObjects();
new CountObjects();
//a=10;
count=30;
m1(args);
CountObjects c=new CountObjects();
c.m2(args);

	}

	public static void m1(String[] args) {
	count=40;
	System.out.println(count);
//	a=10;
	}
public  void m2(String[] args) {
	count=50;
	System.out.println(count);
    b=30;
}
}
