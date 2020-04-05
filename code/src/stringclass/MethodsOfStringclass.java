package stringclass;

public class MethodsOfStringclass {
	static Character a= 128;
	static Character c=128;

	public static void main(String[] args) {
//		System.out.println(String .copyValueOf());
		Integer wrapper= Integer.valueOf("10");
		System.out.println(wrapper);
		int primitive = Integer.parseInt("10");
		System.out.println(primitive);
		String String1= String.valueOf(wrapper);
		System.out.println(String1);
		String String2 = wrapper.toString();
		System.out.println(String2);
		System.out.println(a==c);



	}

}
