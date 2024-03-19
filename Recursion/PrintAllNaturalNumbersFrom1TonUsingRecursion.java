package Recursion;

import java.util.*;

public class PrintAllNaturalNumbersFrom1TonUsingRecursion {
	static void printIncreasing(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int n = sc.nextInt();
		printIncreasing(n);

	}
}
