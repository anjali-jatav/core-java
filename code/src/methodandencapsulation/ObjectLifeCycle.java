package methodandencapsulation;

public class ObjectLifeCycle {
	 
	/*StringBuilder sb;
	sb=new StringBuilder();*/
//	static StringBuilder sb;// object not created

	public static void main(String[] args) throws Exception{
		
		System.out.println(new ObjectLifeCycle().go((short)10));
    /*  System.out.println(sb);
		System.out.println(sb.append(true));
		ObjectLifeCycle olc;
		olc=new ObjectLifeCycle(); //valid  */
		
	/*	int i;
		if(new ObjectLifeCycle().go(10)) 
			i=6;
//			System.out.println(i);*/
		
	}
    boolean go(short y) {
    	if(y<10)return true;
    	else return false;
    }
}
