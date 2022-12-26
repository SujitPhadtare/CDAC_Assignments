package day3lab;
//3:Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array : ");
		int len = sc.nextInt();

		int arr[] = new int[len];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < len; i++) {
			if (arr[i] < min)
				min = arr[i]; // Minimum
			if (arr[i] > max)
				max = arr[i]; // Maximum
		}

		System.out.println("Minimum element = " + min);
		System.out.println("Maximum element = " + max);
		sc.close();

	}

}