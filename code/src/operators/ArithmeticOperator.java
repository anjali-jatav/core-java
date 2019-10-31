package operators;

public class ArithmeticOperator {
byte b1;
byte b2;
int c=b1+b2;
public static void main (String args[]) {
//	System.out.println(10/0);Arithmetic Exception(AE)
	System.out.println(-10.0/0);//-Infinity
	System.out.println(0.0/0);//-NAN
//	System.out.println(0%0)//AE
	System.out.println(10+"anjali");//10anjali
    System.out.println("20"+10+20+"30"+(40+50));  // 2010203090
    
}
}
  