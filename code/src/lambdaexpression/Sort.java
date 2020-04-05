package lambdaexpression;

//Q.Suppose an Employee class having fields e_id,e_name,e_salary,LocalDate e_dob.
//1.Sort on the basis of all the fields.
//2.If your sorting based on e_salary,if e_salary of the 2 employees are same then do the sorting by e_name and 
// and if e_name is also same then do the sorting by e_dob.

import java.util.Comparator;

public class Sort {
	//public static Comparator<Student> sortByName = new Comparator<Student>() {

	//	@Override
		/*public int compare(Student s1, Student s2) {
			int i = s1.getFirstname().compareTo(s2.getFirstname());
			if (i == 0) {
				return s1.getLastname().compareTo(s2.getLastname());
			}
			return i;
		}

	};*/
	/*public static Comparator<Student> sortBySid = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getSid() - s2.getSid();

		}

	};*/
	public static Comparator<Student> sortByPhone = new Comparator<Student>() {

		@Override
		public int compare(Student s1, Student s2) {
			return -s1.getPhone()-s2.getPhone();
			
		}
		
	};

}
