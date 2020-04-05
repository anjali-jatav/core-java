package inheritance;
import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		ArrayList <Integer> l2=new ArrayList<>();
		ArrayList <Long> l3=new ArrayList<>();
		ArrayList <Integer> l4=new ArrayList<>();
		
		ArrayList <Object> l5=new ArrayList<>();
		ArrayList  l6=new ArrayList();
		l6.add(10);
		l4.add(20);

//		 l2=l3;
//		 l3=l2;
		 l2=l4;
//		 l4=l3;
		 
		 l5=l6;
		 l6=l5;
//		 l5=l4;
		 l6=l3;
//		 l4=l5;
		 l4=l6; //  Generic refrence can hold non-generic refrence and vice-versa.  
		 l6=l4;
//		 System.out.println(l4);
		// List <? super B> l7=new ArrayList<>();//uncomment
//		 List <? extends B>l8=new ArrayList<>(); //uncomment
//		 l7=l8;
//		 l8=l7;
//		 l7.add(new A());
//		 l7.add(new C());//uncomment
//		 l8.add(new C());
//		 l8.add(new B());//uncomment
//		 l8.add(null);
//		 l7.add(new B());
//		 List <ClassA> l9=new ArrayList<>();//uncomment//List<? super B>,if B is an interface then we can take either B type or super-classes(F and Object)
//		 of its implementation class and parent of B(A interface).
		 
		 
		 
		 

//	}
  /* public static void m1(List <? super B> l7)  {
	   l7.add(null);
//	   l7.add(new F());// if B is an interface ,we can add only implementation classes (D,C,E) of B and null.
//	   if B is a class,we can add only B type or its sub-types.
   }

 interface A{}
 interface B extends ClassA{}
 class D extends F implements B{}
 class C extends D {}
 class E extends C {} 
 class F {}*/

	}
}



