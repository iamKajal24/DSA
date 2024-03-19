package Recursion;

public class ArrayRecursion {
	static void PrintArray(int arr[], int index) {
		if (index == arr.length) {// base case
			return;
		}

		// self work
		System.out.println(arr[index]);

		// recursive arr
		PrintArray(arr, index + 1);

	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9 };
		PrintArray(arr, 0);

	}
}
