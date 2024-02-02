package DataStructureProgram;

public class UpdateOperation {

	public static void main(String[] args) {
		int arr[] = { 18, 30, 15, 70, 12 };
		int item = 50;
		int item1 = 90;
		int pos = 3;
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Give Update array an element :");
		arr[pos - 1] = item;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
