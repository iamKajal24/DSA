package DataStructureProgram;

public class CountTheNumberOfElementsStriclyGreaterThanValueX {
	static int countOccurence(int arr[], int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 9, 12, 43, 20 };
		int x=10;
		System.out.println("COUNT OCCURRENCES OF X :" + countOccurence(arr, x));
	}
}
