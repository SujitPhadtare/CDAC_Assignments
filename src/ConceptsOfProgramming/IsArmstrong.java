//17:Write a program to check entered number is Armstrong number or not.
package day1lab;

import java.util.Scanner;
//import java.lang.Math;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, i = 0, sum = 0;

		int arr[] = new int[10];
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		num1 = num;

		while (num1 != 0) {
			arr[i] = num1 % 10;
			num1 = num1 / 10;
			i++;
		}

		int raisedTo = i;

		for (int j = 0; j < raisedTo; j++) {
			sum += Math.pow(arr[j], raisedTo);
		}

		if (num == sum)
			System.out.println(num + " is a Armstrong number.");
		else
			System.out.println(num + " is a Not Armstrong number.");
		sc.close();
	}

}