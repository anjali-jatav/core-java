package operators;

public class ShortcircuitOperator {
	
	
public static void main(String[] args) {
	int a=10;
	if(a < 0 || ++a > 10)
	{
	a++;	
	}
	/**else {
		System.out.println("condition fails!!");
	}**/
	System.out.println(a);//12
}
}
