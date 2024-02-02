package DataStructureProgram;

public class DeletionOperation1 {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = new int[10];
		arr[0] = 34;
		arr[1] = 25;
		arr[2] = 56;
		arr[3] = 27;

		System.out.println("Array befor Deletion");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		int pos = 2;
		System.out.println("Array After Deletion");
		for (int i1 = pos; i1 < n; i1++) {
			arr[i1] = arr[i1 + 1];
		}
		--pos;
		for (int i1 = 0; i1 < n; i1++) {
			System.out.println(arr[i1] + " ");
		}
	}
}
