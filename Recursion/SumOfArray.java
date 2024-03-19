package Recursion;

public class SumOfArray {
	static int Sum(int arr[], int idx) {
		if (idx == arr.length) {// base case
			return 0;
		}
		// recursive case
		int smallAns = Sum(arr, idx + 1);// 16,17,8,9

		// self work
		return smallAns + arr[idx];
	}

	public static void main(String[] args) {
		int arr[] = { 5, 16, 17, 8, 9 };
		System.out.println(Sum(arr, 0));
	}
}
