package TwoPointerApproach;

import java.util.*;

public class SecondApproach0SAnd1s {

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    
    static void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    static void SortZeroesAndOnes(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(left, right, arr);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr);

        SortZeroesAndOnes(arr);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}
