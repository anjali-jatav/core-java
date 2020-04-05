package controlflow;
import java.util.Scanner;

public class FactorialOfNo {
	public static void printFactorial(int n) {
		int fact =1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("factorial is: "+fact);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number whose factorial to be found: ");
		int i=sc.nextInt();
		if(i>-1) {
			printFactorial(i);
		}
		else{
			System.out.println("Must enter Positive number only!!");
			
		}
		
		

	}

}
