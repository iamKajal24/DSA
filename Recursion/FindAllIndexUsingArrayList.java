package Recursion;
import java.util.*;
public class FindAllIndexUsingArrayList {
	
	static ArrayList<Integer> allIndex(int arr[], int n, int target,int idx){
		if(idx==arr.length) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> ans=new ArrayList<>();
		if(arr[idx]==target) {
			ans.add(idx);
		}
		ArrayList<Integer> smallans=allIndex(arr,n,target,idx+1);
		ans.addAll(smallans);
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,2,5,6,2,2};
		int target =2;
		int n=arr.length;
		ArrayList<Integer> ans=allIndex(arr, n, target, 0);
		for(Integer i:ans) {
			System.out.print(i+" ");
		}
	}
}
