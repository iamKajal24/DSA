package Recursion;

public class CountThedigitsinAgIvenNumberN {
	static int Countdigit(int n) {
		if (n == 0) return 0; // base case
		return 1 + Countdigit(n / 10);
	}
	public static void main(String[] args) {
		int n=5678;
		int digitCount = Countdigit(n);
		System.out.println(digitCount);
	}
}
