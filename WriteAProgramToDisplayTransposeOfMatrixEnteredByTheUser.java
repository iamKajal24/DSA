package TWODARRAY;

import java.util.*;

public class WriteAProgramToDisplayTransposeOfMatrixEnteredByTheUser {
	static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
//
//	static int[][] findTranspose(int matrix[][], int r, int c) {
//		int ans[][] = new int[c][r];
//		for (int i = 0; i < c; i++) {
//			for (int j = 0; j < r; j++) {
//				ans[i][j] = matrix[j][i];
//			}
//		}
//		return ans;
//	}
	
	//Square method in used
	static void transposePlace(int matrix[][], int r, int c) {
		for(int i=0;i<c;i++) {
			for(int j=i;j<r;j++) {
				//swap matrix[i][j]
				
				int temp = matrix[i][j];
				matrix[i][j]= matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and col of matrix ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		int totalElement = r * c;
		System.out.println("Enter" + totalElement + " Values");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input Matrix");
		printMatrix(matrix);

		//System.out.println("Tranpose of matrix");
		//int ans[][] = findTranspose(matrix, r, c);
	//	printMatrix(ans);
		
		System.out.println("Transpose of matrix");
		transposePlace(matrix, r, c);
		printMatrix(matrix);

	}

}
