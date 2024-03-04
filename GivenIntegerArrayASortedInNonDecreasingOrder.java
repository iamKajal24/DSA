package TwoPointerApproach;

public class GivenIntegerArrayASortedInNonDecreasingOrder {
    static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after printing the array
    }

    static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(i, j, arr);
            i++;
            j--;
        }
    }

    static int[] SortedSquare(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int k = n - 1; // Index for the new array
        int ans[] = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        int n = arr.length;

        System.out.println("Original Array:");
        PrintArray(arr);

        int[] ans = SortedSquare(arr);

        System.out.println("Sorted Array:");
        PrintArray(ans);
    }
}
