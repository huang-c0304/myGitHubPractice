package myJavaProject;

import java.util.Scanner;

public class myAppTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.println("------ Software Engineering Lab ------");
		System.out.println("------ Chun-Wei Huang / 300290304 ----");
		
		System.out.println("\n-- Addition");
		
		System.out.print("Please enter the firrst number:	");
		a = input.nextInt();
		
		System.out.print("Please enter the second nunber:	");
		b = input.nextInt();
		
		addition(a, b);
		substraction(a, b);
		
	}
	
	public static void addition(int a, int b) {
		int result = a + b;
		System.out.println("The result of addition is " + result);
	}
	
	public static void substraction(int a, int b) {
		int result = a - b;
		System.out.println("The result of substraction is " + result);
	}

}
