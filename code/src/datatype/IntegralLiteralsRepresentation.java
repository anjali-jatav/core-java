package datatype;

import java.util.ArrayList;

public class IntegralLiteralsRepresentation {

	public static void main(String[] args) {
	int a=0b1_00;
	int b=0_53;
	float v=18.9f;
System.out.println(v);
System.out.println(a);
System.out.println(b);
int c=1_00_000;
char d='\u0000';
char f='\uffff';
System.out.println(d);
System.out.println(f);

char g=65535;
System.out.println(g==f);
char h=0;
System.out.println(h==d);
int  i='z';
System.out.println(i);
ArrayList<MethodAccessFromClass> l=new ArrayList<>(); 
//l.add(10);
	}

}
