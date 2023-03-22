package day3lab;
//5:Write a Java program to accept 2D aaray elements.Display all elements.

import java.util.Scanner;

public class ArrayTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Dimensions of 2D array arr[][] : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];

		System.out.println("Enter " + (row * col) + " array elements : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// Print array
		System.out.println("The 2D array is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
