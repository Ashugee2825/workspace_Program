package learn.program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		
		int fib1 =0, fib2=1, fib3;
		System.out.println(fib1+" "+fib2+" ");
		
		for(int i =3; i<=n; i++) {
			fib3=fib1+fib2;
			System.out.println(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
		

	}

}
