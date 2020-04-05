package operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		Parent p1 = new Child();
		String s=new String();
		if (p1 instanceof Parent ) // true but(p instanceof child) -> false
		{
			System.out.println(true);

		} else {
			System.out.println(false);
		}
//		null instanceof InstanceOfOperator;

	}

}
