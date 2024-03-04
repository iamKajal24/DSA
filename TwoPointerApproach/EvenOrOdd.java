package TwoPointerApproach;

import java.util.*;

public class EvenOrOdd {
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	static void Swap(int left, int right, int arr[]) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	static void sortArrayParity(int arr[]) {
		int n = arr.length;
		int left = 0, right = n - 1;
		while (left < right) {
			if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
				Swap(left, right, arr);
				left++;
				right--;
			}
			if (arr[left]%2 == 0) {
				left++;
			}
			if (arr[right]%2 == 1) {
				right--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the even or Odd number");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array");
		printArray(arr);

		sortArrayParity(arr);

		System.out.println("Sorted Array");
		printArray(arr);
	}
}
