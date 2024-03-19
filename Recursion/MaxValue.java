package Recursion;

public class MaxValue {
	static int MaxArray(int arr[], int index) {
		if (index == arr.length - 1)
			return arr[index];// base case

		int smallans = MaxArray(arr, index + 1);// small problem

		return Math.max(arr[index], smallans);// self work and final ans

	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 17, 20, 9, 10 };
		MaxArray(arr, 0);
		System.out.println(MaxArray(arr, 0));
	}
}
