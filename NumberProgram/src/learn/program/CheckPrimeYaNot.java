
package learn.program;

import java.util.Scanner;


public class CheckPrimeYaNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int count = 0;
	//Dividing  n to 1	 
		for(int i =1; i<=n; i++)	{
		 	count = 0;
	//
	 
			   if(n%i == 0)
			   {
				 count++;
			}
		}
			   if(count ==2)
			   {
				   System.out.print("IT is a prime");
			   }
			   else  {
				   System.out.println("It is not Prime");
			   }
		}
		
}
