package day3lab;

//package day3lab;
/*1:Java program to print the following pattern on the console
*/

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height;

		System.out.println("Enter height of Star Pyramid (Positive integer): ");
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
//        height = 5;
		if (height <= 0)
			System.out.println("Height cannot be negative or zero.");
		else {
			System.out.println("\n------------------------------\n1.");
// 1.
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
			for (int h = 1; h <= height; h++) {
//				for (int b = height; b > h; b--) {
//					System.out.print("");
//				}
			for (int b = 1; b <= h; b++) {
					System.out.print("* ");
				}
				System.out.println();
			}

			System.out.println("\n------------------------------\n2.");

//*******************************************************************
// 2.		
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 		
			for (int h = 1; h <= height; h++) {
				for (int b = height; b > h; b--) {
					System.out.print("  ");
				}
				for (int b = 1; b <= h; b++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n------------------------------\n3.");

//*******************************************************************
// 3.
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 

			for (int h = 1; h <= height; h++) {
				for (int b = height; b > h; b--) {
					System.out.print(" ");
				}
				for (int b = 1; b <= h; b++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n------------------------------\n4.");
//*******************************************************************
//4.				
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 

			for (int h = 1; h <= height; h++) {
				for (int b = 2 * height; b > 2 * h; b--) {
					System.out.print(" ");
				}
				for (int b = 1; b <= 2 * h - 1; b++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n------------------------------\n5.");
//*******************************************************************
// 5.
//      * * * * 
//	   * * * 
//    * * 
//   * 
			for (int h = height; h >= 1; h--) {
				for (int b = h; b >= 1; b--) {
					System.out.print(" ");
				}
				for (int b = 1; b <= h; b++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n------------------------------\n6.");
//*******************************************************************
// 6.
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
//
			for (int h = 1; h <= height; h++) {
				for (int b = height; b > h; b--) {
					System.out.print("");
				}
				for (int b = 1; b <=(height-h+1); b++) {
					System.out.print("* ");
				}
				System.out.println();
			}
//********************************************************************
		}
		sc.close();

	}

}
