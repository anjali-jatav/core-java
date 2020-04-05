package lambdaexpression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
	List<Student> li=new ArrayList<>();
	Student s1=new Student (1,"anjali","jatav ",111);
	Student s2=new Student (2,"sanjali ","jatav ",222);
	Student s3=new Student (3,"ambe" ,"bhatt",333);
	Student s4=new Student (4,"anu ","dubey",444);
	Student s5=new Student (5,"shail ","mishra",555);
	Student s6=new Student (6,"shradha ","jadiya",666);
	Student s7=new Student (7,"battery"," mishra",777);
	Student s8=new Student (8,"ankita ","jain",888);
	Student s9=new Student (9,"soniya ","kumari",999);
	Student s10=new Student (10,"summi ","shrivastav",1000);
//	String firstname = s1.getName();
	li.add(s1);
	li.add(s2);
	li.add(s3);
	li.add(s4);
	li.add(s5);
	li.add(s6);
	li.add(s7);
	li.add(s8);
	li.add(s9);
	li.add(s10);
	/*Iterator<Student> it = li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}*/
//    Q1. Fetch those students whose name starts with A ?
    	/**	List<Student>list=new ArrayList<>();
    		for (Student st:li) {
    			if(st.getName().startsWith("a")) {
    			list.add(st);
    			}
    		}
    		list.forEach(System.out::println);
    		
         }*/
//    Q2. Fetch those students whose sid lies between 5 to 8 ?
	/**       List<Student>list1=new ArrayList<>();
	       for(Student st:li) {
	    	   if(st.getSid()<8 && st.getSid()>5) {
	    		  list1.add(st);
	    	   }
	       }
	    	   list1.forEach(System.out::println);**/
	    	   
//    Q3. Update those students name whose name starts with "s"and length must be > 5 and update with "Java"?
	    	/**   List<Student>list2=new ArrayList<>();
	    	   for(Student st:li) {
	    		   if(st.getName().length()>5 && st.getName().startsWith("s")) {
	    			   list2.add(st);
	    			   st.setName("Java");
	    			   
	    		   }
	    	   }
	    	   list2.forEach(System.out::println); **/
//    Q4. Update all the students name first character with upper letter ?
	      /**  List<Student>list3=new ArrayList<>();
	        for(Student st:li) {
	        st.setName(st.getName().substring(0,1).toUpperCase().concat(st.getName().substring(1)));
	        		list3.add(st);
	       
	        	
	        	 }
	        
	
	        list3.forEach(System.out::println);**/
	
   
	
//	  Q5. Update all the students first name and last name with upper letter ?
	    List<Student>list4=new ArrayList<>();
	     for (Student st:li) {
//	    	 String[] fn ame = st.getName().split(" ");
//	    	st.setFirstname(st.getFirstname().substring(0, 1).toUpperCase().concat(st.getFirstname().substring(1))).
//	    	concat(st.setLastname(st.getLastname().substring(0, 1).toUpperCase().concat(st.getLastname().substring(1))));
	    	list4.add(st);
	    	
	     }
//	    	 String[] spt = st.getName().split(" ");
//	         st.split(st.getName());
	    	 
//	    	 
	       list4.forEach(System.out::println);
	}
}
	    
			  
	
	
	
	
	
	




