package lambdaexpression;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Student>set=new ArrayList<>();
		Student s1=new Student (1,"anjali","jatav ",111);
		Student s2=new Student (2,"sanjali ","jatav ",222);
		Student s3=new Student (3,"ambe" ,"bhatt",333);
		Student s4=new Student (4,"anu ","dubey",444);
		Student s5=new Student (5,"shail ","mishra",555);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		Collections.sort(set, Sort.sortByPhone);
		set.forEach(System.out::println);

	}

}
