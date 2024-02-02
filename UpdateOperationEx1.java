package DataStructureProgram;
import java.util.*;

public class UpdateOperationEx1 {

	public static void main(String[] args) {
		int capacity = 10;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of your Array");
		int size = in.nextInt();
		System.out.println("Given array elements are : ");
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("which element to update to index");
		int pos = in.nextInt();

		System.out.println("which element to update");
		int item = in.nextInt();

		System.out.println("Give Update array an element :");
		arr[pos - 1] = item;
		arr[pos] = item;
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
