package exceptionhandling;

public class Test4_Q14 {
	public static void run() {
		throw new RuntimeException();
	}
    public static void main(String[] args) {
		try {
			run();
			System.out.println("ok");
		}
		catch(RuntimeException runtime) {
			System.out.println("Runtime.");
		}
		catch(Exception ex1) {
			System.out.println("Exception here.");
		}
		finally {
			System.out.println("finally here.");
		}
		System.out.println("Terminated.");
	}
}
