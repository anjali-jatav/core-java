package operators;

public class ShiftOperator {
	
public static void main(String[] args) {
	byte a=-4;
	//Right shift operator Note:-if +ve value put 0 at empty places and for -ve values put 1 at empty places
	System.out.println(a>>2);
	byte  b=4;
	//Left Shift operator Note:- +ve or -ve value doesn't affect result.
	System.out.println(b<<2);
	byte c=-4;
	System.out.println(c>>>3);
}
}
