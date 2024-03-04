package PrefixSum;

import java.util.Scanner;

public class PrefixQueries2 {
       static int[] makePrefixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1]; // arr[i]=arr[i]+arr[i-1]
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefsum = makePrefixSum(arr);
        
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans;
            if (l == 0) {
                ans = prefsum[r];
            } else {
                ans = prefsum[r] - prefsum[l - 1];
            }

            System.out.println("Sum: " + ans);
        }
    }
}
