package TWODARRAY;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
    static void printMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Wrong Input - Multiplication not Possible");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Resultant Matrix:");
        printMatrix(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix A:");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix A:");
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter Matrix A values:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for matrix B:");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for matrix B:");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter matrix B values:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(a);

        System.out.println("Matrix 2:");
        printMatrix(b);

        multiplication(a, r1, c1, b, r2, c2);
    }
}
