package JavaProgrammingPunithSelfPractice;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any Number betwee 1- 4");
        int num = scan.nextInt();		
        if (num ==1) {
		System.out.println(" you have Press the Key-1 on the Keyboard");
        } else if(num ==2) {
		System.out.println(" you have Press the Key-2 on the Keyboard");
        } else if (num == 3) {
		System.out.println(" you have Press the Key-3 on the Keyboard");
        } else {
		System.out.println(" you have Press the Key-4 on the Keyboard");
        }
	}

}
