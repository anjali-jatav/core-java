package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		String value = 10>20 ? "Gandi aatma" : 10<20 ? (20<10 ? "Dukhi aatma": "Anjali"): "Shail";
        System.out.println(value);
	}

}
