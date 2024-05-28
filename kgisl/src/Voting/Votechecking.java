package Voting;

import java.util.Scanner;

public class Votechecking {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		
		int age = sc.nextInt();
		if(age <= 18) {
			System.out.println("Your eligible for voting");
		}else if(age > 18 && age<40) {
			System.out.println("eligible for voting");
		}else if(age > 40 && age<60) {
			System.out.println("senior citizen most eligible");
		}else if(age > 60) {
		System.out.println("Super Senior citizen most most eligible");
		}
			else {
			System.out.println("not eligible for voting");
		}
		System.out.println("Enter your Number");
		int number = sc.nextInt();
		if(number==20) {
			System.out.println("hi");
		}else {
			System.out.println("bye");
		}
	}

}
