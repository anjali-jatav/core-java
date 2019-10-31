package operators;

public class WrapperClass {
	/**range:- -128 to 127 & is applicable for Integrals only i.e for S,B,I,L not for D & F i.e; if the 
	value are in range only one object is created but if the value exceed the range then two object are 
	created for same value stored in different variables. **/

	public static void main(String[] args) {
	  Double a=-128d;
      Double b=-128d;
      System.out.println(a==b); //true
      System.out.println(a.equals(b)); //true
      Integer c=new Integer(20);
      Integer d=new Integer(20);
      System.out.println(c==d); //false
      System.out.println(c.equals(d)); //true
      // String to wrapper
//      String s1="10";
//      String valueOf = String.valueOf("10");
        Integer i = Integer.valueOf("10");
        
        //Wrapper to String
        String s1 = String.valueOf(i);
      
        // String to Primitive
        String s2="10";
        
        
	}

}
