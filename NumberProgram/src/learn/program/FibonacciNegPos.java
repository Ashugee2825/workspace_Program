package learn.program;

import java.util.Scanner;

public class FibonacciNegPos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		int fib1 =0, fib2 =1, fib3;
		if(n<0)
		{
			System.out.println("Invalid Number");
		}
		else if(n ==  2) {
			System.out.println(fib1+" "+fib2+" ");
		}
		else {
			System.out.println(fib1+" "+fib2+" ");
			for(int i =3; i<=n; i++) {
				fib3 = fib1+fib2;
				if(i==n)
					System.out.print(fib3+" ");
				fib3 = fib1+fib2;
				System.out.print(fib3+" ");
				fib1= fib2;
				fib2 = fib3;		
			}
		}
	}

}
