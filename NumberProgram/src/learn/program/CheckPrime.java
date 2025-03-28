package learn.program;

import java.util.Scanner;


public class CheckPrime {
	public static void main(String[] args) {
		// object of Scanner 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int count = 0;
		// checking the num 2 to n
		for(int i =2; i<=n; i++)
		{
			count = 0;
			
			// dividing 
			for(int j=1; j<=i; j++) {
	
			   if(i%j == 0)
			   {
				 count++;
			}
			}
			   if(count ==2)
			   {
				   System.out.print(i+ " ");
			   }
		}
		}
	}

