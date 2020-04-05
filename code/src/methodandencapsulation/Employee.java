package methodandencapsulation;

public class Employee {
	 private String name;
	 
	 Employee(String newName){
		 name=newName;
	 }
	 
	 public String getname() {
		 return name;
	 }
	 
	 public void setName(String val) {
		 name=val;
	 }
	 
	 public static void swap(Employee emp1,Employee emp2) {
		 Employee temp = emp1;
			emp1 = emp2;
			emp2 = temp;
			
	 }
	 public static void resetValueOfName(Employee e1) {
		 e1.setName("Anu");
	 }

	public static void main(String[] args) {
		Employee emp1=new Employee("Kalawati");
		Employee emp2=new Employee("Amit");
		System.out.println(emp1.getname()+":"+ emp2.getname());  // Kalawati:Amit
		swap(emp1,emp2);
		System.out.println(emp1.getname() +":" + emp2.getname()); // Kalawati:Amit
		resetValueOfName(emp1);
		System.out.println(emp1.getname()); // Anu
		
	}
}