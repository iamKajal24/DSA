package DataStructureProgram;

public class CountTheNumberOOccurenceOfaParticularElementArray {
	static int CountOccurrences(int []arr,int x) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {5,6,7,5,8,5,6,5};
		int x =5;
		System.out.println("COUNT OF X :" +CountOccurrences(arr,x));
	}
}
