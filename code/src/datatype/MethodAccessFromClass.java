package datatype;

public class MethodAccessFromClass {


	public static void main(String[] args) {
	  
	  System.out.println(Integer.BYTES);
      System.out.println(Integer.SIZE);
      System.out.println(Integer.sum(-10,43));
	  System.out.println(Integer.compare(35,45));
	  System.out.println(Integer.max(34, 78));
	  System.out.println(Integer.toBinaryString(10));
	  System.out.println(Integer.min(12, 35));
	  System.out.println(Integer.highestOneBit(9));
	  System.out.println(Integer.lowestOneBit(9));
	  System.out.println(Integer.bitCount(33));
      System.out.println(Integer.compareUnsigned(55,25));
      System.out.println(Integer.toOctalString(43));
      System.out.println(Integer.toHexString(23));
	  }

}
