package datatype;

public class MethodAccessFromClass {
	//int i;
	static int i=10;
	int l=7;
	/*public void var() {
		System.out.println(i);
	} */
	{
		l=0;
		int x;
		final int z=3;
		i=9;
	}
	static {
		
		i=8;
		int x;
	}
	public void m1() {
		int x;
	}
	public static void m2() {
		 int x;
	}
	public void m3(int f,int g) {
		f=8;
	}


	public static void main(String[] args) {
		/*MethodAccessFromClass obj=new MethodAccessFromClass();
		obj.var();*/
		
//	  Integer x=120;
	  System.out.println(Integer.BYTES);
      System.out.println(Integer.SIZE);
      System.out.println(Integer.sum(-10,43));
	  System.out.println(Integer.compare(35,45));
	  System.out.println(Integer.max(34, 78));
	  System.out.println(Integer.toBinaryString(10));
	  System.out.println(Integer.min(12, 35));
	  System.out.println(Integer.highestOneBit(5));
	  System.out.println(Integer.lowestOneBit(5));
	  System.out.println(Integer.bitCount(33));
      System.out.println(Integer.compareUnsigned(25,45));
      System.out.println(Integer.toOctalString(53));
      System.out.println(Integer.toHexString(23));
	  }

}
