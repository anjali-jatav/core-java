package javabasics;
import static javabasics.pack2.Anjali.name;
import static javabasics.pack2.Anjali.m1;
import static java.lang.System.out;
import static javabasics.pack2.Anjali.s;
public class Test {
	static boolean x;
	static boolean y;

	public static void main(String[] args) {
		x = x || y && !x;
		y = y && x || y;
		System.out.println(x);
		System.out.println(y);
		Student s =new Student();
//	    Anjali a=new Anjali();
//	String name = javabasics.pack2.Anjali.name; 
	System.out.println(name);
	m1();
	out.println("Shail");
	s.m2();
	}
}