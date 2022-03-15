package myJava2;

import java.util.Scanner;

public class YouTubeTutorial5GettingUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter some number");
		int user_input_number = scan.nextInt();
			System.out.println ("The entered value is");
			System.out.print (user_input_number);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println ("Enter some decimal value");
		double user_input_double = scan1.nextDouble();
			System.out.println ("The entered value is");
			System.out.print (user_input_double);
			
		Scanner scan3 = new Scanner (System.in);
		System.out.println ("Enter some String");
		String user_input_string = scan3.nextLine();
			System.out.println ("The entered String is");
			System.out.print (user_input_string);	
	}
}
