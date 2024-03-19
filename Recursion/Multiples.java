package Recursion;

import java.util.*;

public class Multiples {
	static void printMultiples(int n, int k) {
		// Base case: When k is 1, print n and return
		if (k == 1) {
			System.out.println(n);
			return;
		}

		// Recursive call to printMultiples with k-1
		printMultiples(n, k - 1);

		// Self work: Print the multiples
		System.out.println(n * k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n = sc.nextInt();
		int k = sc.nextInt();
		printMultiples(n, k);
	}
}
