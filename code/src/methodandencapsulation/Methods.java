package methodandencapsulation;
import api.Student;

public class Methods {
	public int m2() {
		
		short i=3;
		byte b=8;
		char c='b';
//		return 0;
//		return i;
//		return b;
//		return c;
		double d=80.0d;
		return (int)d;
				
	}
	public Student m3() {
//		return null;
		return new Student(1,null,null);
	}
    public int[] m4() {
//    	return null;
//    	return new int[0];
    	/*int[] array= {10,20,80};
    	return array;*/
    	int [] arr=new int[4];
    	return arr;
    }
    public String m5() {
//    	return "Anjali";
    	return new String();
    }
    public Object m6() {
    	return 10;
    }
}
