package Recursion;

import java.util.*;

public class Factorial {
	static int calculateFactorial(int n) {
		// base case
		if (n == 0)
			return 1;

		// smaller problem - recursive work
		int smallAns = calculateFactorial(n - 1);

		// big problem = self work
		int ans = n * smallAns;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		int factorialResult = calculateFactorial(n);
		System.out.println("Factorial of " + n + " is: " + factorialResult);
	}
}
