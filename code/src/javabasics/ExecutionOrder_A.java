package javabasics;
import static javabasics.pack2.Anjali.*;
import static javabasics.Student.*;
public class ExecutionOrder_A {
	int a;
	static int b = m4();
	int e = m3();
	static int c = m2();
	static int d;
	static {
		System.out.println("static block 1");
	}

	static void m1() {
		System.out.println("m1()");
	}

	static int m2() {
		System.out.println("m2()");
		return 10;
	}

	int m3() {
		System.out.println("m3()");
		return 30;
	}

	static int m4() {
		
		System.out.println("m4()");
		return 20;
	}

	static {
		System.out.println("static block 2");
	}
	{
		System.out.println("block 3");
	}

	ExecutionOrder_A() {
		System.out.println("it is a constructor");
	}


	public static void main(String[] args) {
		ExecutionOrder_A e= new ExecutionOrder_A();
	    System.out.println(name);
	    m1();
	    System.out.println("Shail");
	    s.m2();
	}

	static {
		int z=200; // In static block ,variables implicitly becomes static.
		System.out.println(z);
		System.out.println(b);
		System.out.println(c);
	}

	{
		//static x=700;   
//		System.out.println(x);
		System.out.println(e);
	    a=25;
		System.out.println(a);
	}
}
