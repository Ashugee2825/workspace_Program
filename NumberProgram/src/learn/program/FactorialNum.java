package learn.program;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a Number");
	  int n = scan.nextInt();
	  int product = 1;
	  for(int i =1; i<=n; i++)
	  {
		  product = product *i;
	  }
	  System.out.println("The multipication of result is:" +product);

	}

}
