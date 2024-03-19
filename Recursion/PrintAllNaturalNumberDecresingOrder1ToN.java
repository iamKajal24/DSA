package Recursion;

import java.util.Scanner;

public class PrintAllNaturalNumberDecresingOrder1ToN {
	static void printDecresing(int n) {
		// base case
		if (n == 1) {
			System.out.println(n);
			return;
		}

		// self work

		System.out.println(n);// n

		// recursive work
		printDecresing(n - 1);// n-1,n-2......n-n
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int n = sc.nextInt();
		printDecresing(n);

	}

}
