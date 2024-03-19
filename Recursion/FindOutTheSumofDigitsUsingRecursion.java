package Recursion;

public class FindOutTheSumofDigitsUsingRecursion {
	static int SumOfDigit(int n) {
		// base case
		if (n >= 0 && n <= 9)
			return n;
		return SumOfDigit(n / 10) + n % 10;

		// recursive work-> small work
		// int smallans = SumOfDigit(n / 10);
		// self work
		// return smallans + n % 10;
	}

	public static void main(String[] args) {
		System.out.println(SumOfDigit(12348));

	}
}
