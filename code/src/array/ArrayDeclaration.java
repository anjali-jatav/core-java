package array;

public class ArrayDeclaration {
	
	public static void main(String[] args) {
		int [][] a=new int[5][2];
		a[1][0]=7;
		a[3][1]=9;
		System.out.println(a[1][1]);
		char[][] b;
		long[][][]c;
//		int[][] a,[][]b ;// invalid
		int [][]y,  z[][][] ;//valid
		int p[][], q[][][] ;// valid
//		int []r,[][]s;// Invalid
		int []d;
		int[]e [];
		int[] [] []g;
//		System.out.println(a);
		char[][]x=new char[2][];
		/*x[0][0]='a';
		x[0][1]='b';
		x[1][0]='c';
		x[1][1]='d';
		x[2][0]='e';*/
//		x[1][1]='f';
//		System.out.println(x);
		
	/*	for(char[] i:x) {
//			for(char j:i) {
				System.out.println(i);
//			}
	}*/
//		int w[]= new int [0];
//		System.out.println(w[0]);
		
	}

}
