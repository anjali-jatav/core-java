package lambdaexpression;

import java.util.Comparator;

public class Employee1Sort {
	public static Comparator<Employee1> sortById = new Comparator<Employee1>() {

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			return -e1.getId()-e2.getId();
		
			
		}
		
	};
	public static Comparator<Employee1> sortByName = new Comparator<Employee1>() {

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			int i=e1.getName().compareTo(e2.getName());
			if(i==0) {
				return e1.getDob().compareTo(e2.getDob());
			}
			
			return i;
		}
		
	};
	public static Comparator<Employee1> sortBySalary = new Comparator<Employee1>() {

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			int i= (int)(e1.getSalary()-e2.getSalary());
		    if(i==0) {
		    	int name = e1.getName().compareTo(e2.getName());
		    	if (name==0) {
		    		return (int)(e1.getDob().compareTo(e2.getDob()));
		    		
		    	}
		    	return name;
		    }
			return i;
		}
		
	};
    public static Comparator<Employee1> sortByDob = new Comparator<Employee1>() {

		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			return e1.getDob().compareTo(e2.getDob());
		}
		
	};
	

}
