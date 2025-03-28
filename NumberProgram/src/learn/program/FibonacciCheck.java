package learn.program;

import java.util.Scanner;

	public class FibonacciCheck {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println("Enter the Value which has to be checked");;
			int val = scan.nextInt();
		    int fib1 =0, fib2 =1, fib3;
			if(n<=0)
			{
				System.out.println("Invalid Number");
			}
		
			else {
				for(int i =3; i<=n; i++) {
					fib3 = fib1+fib2;
					if(i==n)
					{
						System.out.print("Prsent");
						return;
					}
					fib1= fib2;
					fib2 = fib3;		
				}
				System.out.print("Not Prsent");
			}
		}

	}
