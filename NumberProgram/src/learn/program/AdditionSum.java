package learn.program;

import java.util.Scanner;

public class AdditionSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value of  n");
		int n = scan.nextInt();
		int sum =0;
		for(int i =1; i<n; i++) {
			//adding every value of i with sum and storing result in
		 sum = 	sum+i; 
		}
		System.out.println("The addtion of Even Number"+sum);
	

	}

}
