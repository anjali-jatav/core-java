package controlflow;

public class IterativeStatements {
	public static void PrintTableOf(int a) {
		/**
		 * for(int i=1;i<=10;i++) { System.out.println(a*i); }
		 **/
		int i = 1;
		while (i <= 10) {
			System.out.println(a * i);
			i++;
		}
	}

	public static void skipOddNumber(int b) {
		for (int i = 1; i <= b; i++) {
			if (i % 2 != 0)
				continue;
//		break;
			System.out.println(i);
		}
	}

public static void main(String[] args) {
//		PrintTableOf(8);
		skipOddNumber(10);
//		while(true);
//		System.out.println("anjali chor hai ");
        Kala:{
			Anjali:{
			   System.out.println("One");
		{
		        Anu:{
			       
			        System.out.println("Two");
			        {
				       System.out.println("three");
				       break Anjali;
			        }
		        }
		
	        }
       }
   }
		System.out.println("four");
}
}
