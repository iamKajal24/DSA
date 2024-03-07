package TWODARRAY;

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void printSpiralOrder(int matrix[][], int r, int c) {
    	int topRow=0, bottomRow= r-1, leftCol=0, rightCol=c-1;
    	int totalElement =0;
    	
    	while(totalElement<r*c) {
    		//towRow-> leftCol to rightCol
    		for(int j=leftCol;j<=rightCol && totalElement<r*c ;j++ ) {
    			System.out.print(matrix[topRow][j]+" ");
    			totalElement++;
    		}
    		topRow++;
    		
    		//rightCol-> topRow to BottomRow
    		for(int i=topRow;i<=bottomRow && totalElement<r*c ;i++ ) {
    			System.out.print(matrix[i][rightCol]+" ");
    			totalElement++;
    		}
    		rightCol--;
    		
    		//bottomRow-> rightCol to leftCol
    		for(int j=rightCol;j>=leftCol && totalElement<r*c ;j-- ) {
    			System.out.print(matrix[bottomRow][j]+" ");
    			totalElement++;
    		}
    		bottomRow--;
    		
    		//leftCol-> bottomRom to TopCol
    		for(int i=bottomRow;i>=topRow && totalElement<r*c ;i-- ) {
    			System.out.print(matrix[i][leftCol]+" ");
    			totalElement++;
    		}
    		leftCol++;
    	}
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElement = r * c;
        System.out.println("Enter " + totalElement + " values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        printMatrix(matrix);
        
        System.out.println("Spiral Order");
        printSpiralOrder(matrix,r,c);
    }
}
