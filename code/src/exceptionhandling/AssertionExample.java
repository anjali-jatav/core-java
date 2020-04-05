package exceptionhandling;

public class AssertionExample {
	public static void main(String[] args) {
		int i=Integer.MIN_VALUE;
		if(i<0) {
		//If negative value, convert into positive value
		i=-i;
		}
		System.out.println("the value of i is :"+i);
		assert(i>=0):"impossible i is negative!";
		}

}
