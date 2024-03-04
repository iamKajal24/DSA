package TwoPointerApproach;
import java.util.*;
// first approach
public class SortanArrayConsistingOfOnly0SAnd1s {

    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // print new line after array
    }

//    static void swap(int i, int j, int[] arr) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    static void sortZeroAndOnes(int arr[]) {
        int n = arr.length;
        int zeroes = 0;

        // Count number of Zeroes
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                zeroes++;
            }
        }
        // 0 to zeroes -1 : 0, zeroes to n-1 : 1
        for(int i = 0; i < n; i++) {
            if(i < zeroes) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        sortZeroAndOnes(arr);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
