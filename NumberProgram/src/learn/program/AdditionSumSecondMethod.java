package learn.program;

import java.util.Scanner;

public class AdditionSumSecondMethod {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = scan.nextInt();
	int sum = 0;
	 sum =  n*(n+1)/2;
	 System.out.println("The Addition of result is: " +sum);
}
}