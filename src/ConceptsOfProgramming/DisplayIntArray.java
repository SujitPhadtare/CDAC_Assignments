//10:read two int array...and store both in third array
//and display third array

package day3lab;

import java.util.Scanner;

public class DisplayIntArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of first array : ");
		int len1 = sc.nextInt();
		int[] arr1 = ArrayOp.readArray(len1);

		System.out.println("Enter length of second array : ");
		int len2 = sc.nextInt();
		int[] arr2 = ArrayOp.readArray(len2);
		int reslen = len1 + len2;
		int[] result = new int[reslen];

		for (int i = 0; i < len1; i++) {
			result[i] = arr1[i];
		}

		for (int i = len1; i < reslen; i++) {
			result[i] = arr2[i - len1];
		}
		System.out.print("First array -------> ");
		ArrayOp.printArray(arr1, len1);
		System.out.print("\nSecond array ------> ");
		ArrayOp.printArray(arr2, len2);
		System.out.print("\nResultant array ---> ");
		ArrayOp.printArray(result, reslen);

		sc.close();
	}

}
