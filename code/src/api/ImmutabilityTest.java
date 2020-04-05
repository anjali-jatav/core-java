package api;


public class ImmutabilityTest {

	public static void main(String[] args) {
		Address ad=new Address ("Bhopal","MP",1234567892);
		Student s=new Student(123,"Anjali",ad);
		System.out.println(s.getAddress().getCity());
		Address address = s.getAddress();
		address.setCity("Sagar");
		System.out.println(s.getAddress().getCity());
		

	}

}
