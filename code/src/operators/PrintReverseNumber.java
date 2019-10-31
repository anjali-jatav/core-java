package operators;

public class PrintReverseNumber {


	public static void main(String[] args) {
     int i=345;
     int b,c,d,e,f,g;
//     int c;
//     int d;
     b=i%10;
     c=i/10;
     d=c%10;
     e=c/10;
     f=e%10;
     g=e/10;
     System.out.println(((b*10)+d)*10+f);
     
     

	}

}
