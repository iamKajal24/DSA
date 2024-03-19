package Recursion;

public class SearchElement {
	static boolean search(int arr[], int n, int target, int idx) {
		// base case
		if (idx >= arr.length)
			return false;

		// self work
		if (arr[idx] == target)
			return true;

		// recursive work
		return (search(arr, n, target, idx + 1));
	}

	public static void main(String[] args) {
		int arr[] = { 4, 12, 54, 14, 3, 8, 6 };
		int target = 14;
		int n = arr.length;
		if (search(arr, n, target, 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		//System.out.println(search(arr, n, target, n));
	}
}
