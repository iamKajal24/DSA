package DataStructureProgram;

public class SerachOperation {

	public static void main(String[] args) {
		int n = 5;
		int j = 0;
		int i;
		int item = 15;
		int arr[] = { 18, 30, 15, 70, 12 };
		System.out.println("Given before an element");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println("After Search Element : ");
		while (j < n) {
			if (arr[j] == item) {
				break;
			}
			j = j + 1;
		}
		System.out.println("Element " + item + " is found at " + j + " position");
	}
}
