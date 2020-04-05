package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class ExceptionTryWithResource {
	public void m1() {
		System.out.println("m1()");
//		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
	    	
	    	}catch(Exception e) {
			System.out.println("Exception Occurs");
			
		}
	}

	public static void main(String[] args) {
		ExceptionTryWithResource e=new ExceptionTryWithResource();
		e.m1();

	}

}
