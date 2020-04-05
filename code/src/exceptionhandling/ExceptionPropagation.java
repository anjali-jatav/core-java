package exceptionhandling;

import java.io.*;

public class ExceptionPropagation {
	public void m1() throws Exception {
		System.out.println("i am m1()");
		m2();
	}
	
	public int m2() throws Exception {
		System.out.println("i am m2()");
		/**
		  try { m3(); } catch (IOException e) {
		  
		  }
		**/
		m3();
		return 10;
	}
	/*public void m5() throws Exception {
		System.out.println("m5()");
		try {
			m3();
		}
		catch(FileNotFoundException e) {}
		}*/

	
	public void m3() throws IOException,Exception,FileNotFoundException{
		System.out.println("i am m3()");
		throw new FileNotFoundException();
	}
/*	public void m4() {
	try {
		
	}
	catch(Error e) {
		System.out.println("system error");
	}
	}*/
	
	public static void main(String[] args) {
		ExceptionPropagation obj = new ExceptionPropagation();
//		obj.m1();
		try {
			obj.m1();
		}catch (Exception |VerifyError | AssertionError e) {}
	

	}
	

}
