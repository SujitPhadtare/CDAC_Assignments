/*6:Write a java program to make the addition of two 2D array
 And store result in Third array.
 */

package day3lab;

import java.util.Scanner;

public class AddTwoDArray {
	static Scanner sc = new Scanner(System.in);

	// getter
	static int[][] getArray(int row, int col) {
		int a[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

	// add array
	static int[][] addArray(int a[][], int b[][], int row, int col) {
		// int a[][] = new int[row][col];
//		int row = a.length;
		int c[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	// print array
	static void displayArray(int a[][], int row, int col) {
//		int a[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Dimensions of 2D array arr[][] : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];

		System.out.println("Enter " + (row * col) + " elements for 1st 2D array : ");
		a = getArray(row, col);
		System.out.println("Enter " + (row * col) + " elements for 2nd 2D array : ");
		b = getArray(row, col);
		System.out.println("Addition of above two 2D arrays : ");
		c = addArray(a, b, row, col);
		displayArray(c, row, col);

		sc.close();
	}

}