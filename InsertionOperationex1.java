package DataStructureProgram;

public class InsertionOperationex1 {

	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int x = 24;
		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 11;

		System.out.println("Array element before insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n Array element After Insertion :");
		for (int i = n; i >= pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = x;
		++n;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
