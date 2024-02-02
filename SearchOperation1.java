package DataStructureProgram;

import java.util.*;

public class SearchOperation1 {

	public static void main(String[] args) {

		int capacity = 10;
		//int item = 45;
		int j = 0;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of your Array");
		int size = in.nextInt();
		System.out.println("Enter the array elements ");
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println("What element is found at what position");
		int item = in.nextInt();
		// searching Operation
		System.out.println("After Search Element : ");
		while (j < size) {
			if (arr[j] == item) {
				break;
			}
			j = j + 1;
		}
		System.out.println("Element " + item + " is found at " + j + " position");

	}

}
