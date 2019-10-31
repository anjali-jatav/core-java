package javabasics;

  public class Student {
	byte a;
	short b;
     int c;
	float d;
	double e;
	long f;
	char g;
	boolean h;
  public static void m2() {
	  System.out.println("I am m2()");
  };
  
	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println(s.d);
		System.out.println(s.e);
		System.out.println(s.f);
		System.out.println(s.g);
		System.out.println(s.h);
	}

}
