package operators;

public class ConditionalOperator {
	

	public static void main(String[] args) {
		/**int a=10;
		int b=30;
		int c=40;
		System.out.println(a<b);
//		System.out.println(a<b<c);  //not allowed **/
		
		//ternary operator/conditional operator
		String name=10>20 ? "Anjali" : "Shail";
        System.out.println(name);
        
//        nested conditional operator

		String value = 10>20 ? "Gandi aatma" : 10<20 ? (20<10 ? "Dukhi aatma": "Anjali"): "Shail";
        System.out.println(value);
	}

}
