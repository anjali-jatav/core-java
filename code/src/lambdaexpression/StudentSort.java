package lambdaexpression;

import java.util.Comparator;

public class StudentSort implements Comparator<Student>  {

	@Override
	public int compare(Student s1, Student s2) {
		int i=s1.getFirstname().compareTo(s2.getFirstname());
		if(i==0) {
			return s1.getLastname().compareTo(s2.getLastname());
		}
		return i;
	}
	
	


	
	

}
