package KondnestProgramming;

public class BasicVariables {
public static void main(String[] args) {
	int a; //declaring a variable of int type
	a = 10; // initializing  a variable
	System.out.println(a);
	a = 20;  //passing A  variable
	System.out.println(a);
	// DAta types
	byte age = 23;
	short yop = 2023;
	int salary = 45000;
	long mobile = 8340584879l;
	float a1 = 42.37f;
	double b = 342.73895646461641841;
	char grade ='A';
	// Boolean
	boolean c = true;
	boolean d = false;
	
	// type casting
	byte e = 51;
	int f;
	f =e;
	
	
	short a2 = 345;
	float b2;
	b2 =a2;
			
	// Explicit typecasting 
	
	float a3 = 325.45014f; 
	short b3;
	b3 =(short)a3;
	System.out.println(age);
	System.out.println(yop);
	System.out.println(salary);
	System.out.println(mobile);
	System.out.println(a1);
	System.out.println(b);
	System.out.println(grade );   //2 byte
     System.out.println(c);    //true 
      System.out.println(d);     // false
      System.out.println(e);  // Implicit TypeCasting
      System.out.println(f);  // Implicit TypeCasting
      System.out.println(a2);   // Implicit TypeCasting
      System.out.println(b2);   // Implicit TypeCasting
      System.out.println(a3);   // short to float small goes to big data as force to goes 
      
      
}
} 
