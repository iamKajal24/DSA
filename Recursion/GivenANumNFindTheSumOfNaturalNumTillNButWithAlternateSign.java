package Recursion;

import java.util.*;

public class GivenANumNFindTheSumOfNaturalNumTillNButWithAlternateSign {

	static int SeriesSum(int n) {
		if (n == 0)
			return 0; // base case
		if (n % 2 == 0) {
			return SeriesSum(n - 1) - n;// even case
		} else {
			return SeriesSum(n - 1) + n;// odd case
		}
	}

	static int SeriesSum1(int n) {
		if (n == 0)
			return 0;
		return SeriesSum1(n - 1) + n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		System.out.println(SeriesSum(n));
	}
}
