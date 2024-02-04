package DataStructureProgram;

public class FindTheLastOccurenceOfAnElementXInAGivenArray {
	static int lastOccurrences(int arr[], int x) {
		int lastIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 7, 6, 8, 6, 9 };
		int x = 6;
		System.out.println("Last Occurrence OF X :" + lastOccurrences(arr, x));

	}
}
