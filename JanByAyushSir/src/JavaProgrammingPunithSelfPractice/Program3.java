package JavaProgrammingPunithSelfPractice;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("Addition of two number " + c);
		c = a - b;	
		System.out.println("Subtarction of two number " + c);
		c = a * b;
		System.out.println("Multiplction of two number " + c);
        c = a / b;
		System.out.println("Division of two number " + c);


	}

}
