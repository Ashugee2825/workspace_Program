package DatatypesProgram;

import java.util.Scanner;

public class AlwaysUse {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Your age: ");
		int age = scan.nextInt();
		System.out.println("Enter Your percentage");
		float per = scan.nextFloat();
		System.out.println("Year of passing: ");
		String yoe = scan.next();
        System.out.println("-------------------------------------------------------");
        System.out.println(name);
		System.out.println(age);
		System.out.println(per);
		System.out.println(yoe);
				
	}

}
