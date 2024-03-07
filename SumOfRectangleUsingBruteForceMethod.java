package BruteForceMethod;
import java.util.*;

public class SumOfRectangleUsingBruteForceMethod {
    static int findSum(int [][]matrix, int l1, int r1, int l2, int r2) {
        int sum=0;
        for(int i=l1;i<=l2;i++) {
            for(int j=r1;j<=r2;j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows and columns of matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        System.out.println("Rectangle sum: " + findSum(matrix, l1, r1, l2, r2));
    }
}
