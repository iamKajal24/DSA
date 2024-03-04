package PrefixSum;

public class PrefixSums1 {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	static int[] makeprefixSum(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1]; // arr[i]=arr[i]+arr[i-1]
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 4, 5 };
		int n = arr.length;
		System.out.println("Original Array");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println("Sorted Prefix Sums");
		int[] pref = makeprefixSum(arr);
		printArray(pref);
	}
}
