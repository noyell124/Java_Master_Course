package testPackage;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int reversed = 0;
		while (num != 0) {
			int res = num % 10;
			reversed = reversed * 10 + res;
			num = num / 10;

		}
		System.out.println(reversed);
	}

}
