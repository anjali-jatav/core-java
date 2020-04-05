package inheritance;

public interface Interface extends X,Y{
	int a=12;
	public void m1();
    public static int m2() {
    	return 0;
    }
    
  public default void m3() {
	  
  }
	
}
