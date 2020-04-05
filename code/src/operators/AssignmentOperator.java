package operators;

public class AssignmentOperator {
//	int a=b=c=d=20; not allowed
   /* int a,b,c,d;
	a=b=c=d=50; */ // not allowed
     static int a,b,c,d;
//     String h,j;
//     h=80;
//     int j;
//   int a=b=c=d=50;// not allowed
	
public static void main(String[] args) {
//	int a,b,c,d;
//	a=b=c=d=60; // allowed
	int a=b=c=d=50;
	int f;
	f=10;
//	f=f+1;
	 // compound assignment operators
	f+=1;//11
	System.out.println(f);
	f-=1;//9
	System.out.println(f);
	f/=2;//5
	System.out.println(f);
	f%=2;//0
	System.out.println(f);
}
}
