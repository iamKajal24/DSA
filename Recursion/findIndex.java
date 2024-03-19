package Recursion;

public class findIndex {
	static int find(int arr[], int n, int target, int idx) {
		if (idx >= arr.length)
			return -1; // base case
		if (arr[idx] == target)
			return idx;// self work
		return find(arr, n, target, idx + 1);// recursive work
	}

	static void findAllIndex(int arr[], int n, int target, int idx) {
		if (idx >= arr.length)
			return;// base case
		if (arr[idx] == target) {// self work
			System.out.println(idx);
		}
		findAllIndex(arr, n, target, idx + 1);// recuursive array
	}


	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 2, 5 };
		int target = 2;
		int n = arr.length;
		System.out.println(find(arr, n, target, 0));
		findAllIndex(arr, n, target, 0);
	}
}
