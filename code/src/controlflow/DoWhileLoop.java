package controlflow;

public class DoWhileLoop {
//	static int i=5;
	public static void printTable(int a) {
		
	}
//		int i=10,j=1;
	/*	if(9>6) { 
			int z=5;// valid
		} */
//		if(false); // valid
		
	/**	boolean f=true;
		if(f=false)
			System.out.println("hii");
		else if(f)
			System.out.println("hello");**/
	/**	do {  
		int o=9;
			i++; 
			System.out.println(i);
		}**/
			
		
			
		
//			System.out.println(i);
		
		 
		
		/*while(i<=10) { // ; is mandatory otherwise compiler error1
		
			System.out.println(a*i);
		i++;
		}
	}*/

	public static void main(String[] args) {
		printTable(5);          
		
		int x=10;
		for(x=10;x>5;x++)
			if (x==16)
				x-=11;
		System.out.println(x+" ");

	}

}
