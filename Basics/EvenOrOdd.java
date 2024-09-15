package testPackage;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n % 2 == 1) {
			System.out.println("the number is Odd");
		}
		else {
			System.out.println("the number is Even");
		}
		
		if(n < 0) {
			System.out.println("n is negative");
		}else if (n > 0) {
			System.out.println("n is positive");
		}else {
			System.out.println("n is zero!");
		}

	}

}
