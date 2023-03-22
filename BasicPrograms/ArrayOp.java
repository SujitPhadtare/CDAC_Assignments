/*9:Create Menu driven program for array operations.
1:Read Array 2:Print Array 3:Search element in array 
4:Reverse Array 5:Even number from array6:sum of array element  
 */

package day3lab;

import java.util.Scanner;

public class ArrayOp {
	static Scanner sc = new Scanner(System.in);

	static int[] readArray(int len) {

		int[] arr = new int[len];
		System.out.println("Enter " + len + " array elements :");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static void printArray(int[] arr, int len) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******** Array Operations **********");
		System.out.println(
				"1: Read Array \n2: Print Array \n3: Search element in array \n4: Reverse Array \n5: Even number from array\n6: sum of array element");
		int choice = sc.nextInt();
		System.out.println("Enter length of array : ");
		int len = sc.nextInt();

		int arr[] = new int[len];

		switch (choice) {
		case 1:	// Read Array
			arr = readArray(len);
			break;

		case 2: // Print Array
			arr = readArray(len);
			System.out.println("The array elements are : ");
			printArray(arr, len);
			break;

		case 3: // Search element in array
			arr = readArray(len);
			System.out.println("Enter a number to search in array :");
			int num = sc.nextInt();
			boolean flag = false;
			for (int n : arr) {
				if (num == n) {
					System.out.println("Number " + num + " is present in the array");
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Number " + num + " is NOT present in the array");
			}
			break;

		case 4: // Reverse Array
			arr = readArray(len);
			int[] revarr = new int[len];
			for (int i = 0; i < len; i++) {
				revarr[i] = arr[len - i - 1];
			}
			System.out.println("The reverse of above array is : ");
			printArray(revarr, len);
			break;

		case 5: // Even number from array
			arr = readArray(len);
			System.out.println("Even numbers from array are : ");
			for (int a : arr) {
				if (a % 2 == 0) {
					System.out.print(a + " ");
				}
			}
			break;

		case 6: // sum of array element
			arr = readArray(len);
			int sum = 0;
			for (int a : arr) {
				sum += a;
			}
			System.out.println("Sum of array elements is : " + sum);
			break;
		}
		System.out.println("\nEnd of Program");
	}
}
