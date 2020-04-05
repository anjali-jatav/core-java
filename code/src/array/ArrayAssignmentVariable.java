package array;

//import java.util.Objects;

public class ArrayAssignmentVariable {

	public static void main(String[] args) {
		int []a=new int [3];
		int [][]b=new int[3][3];
//		b=a;
		int []c=new int[4];
		char[]ch=new char[2];
//		ch=c;
		int d[]=new int [3];
		int e[]=new int [2];
		e=d;// valid
		int []f= {10};
		char []g= {'a'};
		a=f;
//		f=g;
		float[][]h=new float[2][];
		h[0][0]=5;
		h[0][1]=2L;
		h[0][2]=4;
		h[1][0]=5;
		h[1][1]=7;
		h[1][2]=2;
		for(float[] n:h) {
		System.out.println(h[0]);
		}
		
		
		/**
		 * Every array is an Object.
		 * This means ,you can assign any array object to variable of type object like this
		 * int []a=new int[3];
		 * Object obj=a; 
		 */
		
		Object obj=new int[3];
		/**
		 * Object[] obj2=new int[3];
		 * It will give you a compilation error because elements of the array pointed to by intArray are not Object
		 * They are ints. Therefore, you can't assign an array of ints to a variable of type array of Objects.
		 */
//		Object[] obj2=new int[3];
		/**
		 * Each element of the array created using new int[2][3] is an array of ints.
		 * An array of ints is an Object and therefore ,an array of ints is an array of Objects.
		 */
//		Object[][] obj3=new int[2][3];// Invalid
		Object[] obj2=new int[2][3]; // Valid
		obj2[0]=new Object();           // valid
		obj2[1]=new String("Anjali"); // valid
		Object obj4=new Object[3];// Parent <- child

	}

}
