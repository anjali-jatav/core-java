package exceptionhandling;

public class ExceptionDemo {
//	static Integer i=5;

	public static void main(String[] args) {
//		System.out.println(i++);
//		System.out.println(i);
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception occur while dividing the no.");
		}
		System.out.println(20/5);
		System.out.println("hello");

	}

}
