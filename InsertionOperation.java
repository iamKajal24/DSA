package DataStructureProgram;

import java.util.Scanner;

public class InsertionOperation {

	public static void main(String[] args) {
		int capacity = 50;
		int a[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array : ");
		int size = sc.nextInt();
		System.out.println("Enter the array element");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("ARRAY BEFORE INSERTION : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}
		// Insertion Operation
		System.out.println("Enter the element to be inserted");
		int x = sc.nextInt();
		System.out.println("Enter the Elemnent or index where you want to insert");
		int pos = sc.nextInt();

		for (int i = size; i > pos; i--) {
			a[i] = a[i - 1];
		}
		a[pos] = x;
		++size;
		System.out.println("AFTER ARRAY INSERTION :");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
