package operators;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println(args[0] +" " +args[1]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your Name:");
       String name= sc.next();
       System.out.println(" Welcome " + name);
        
        
        
	}

}
