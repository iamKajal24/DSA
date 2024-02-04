package DataStructureProgram;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of size Element : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.print("Enter " + n + " elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
