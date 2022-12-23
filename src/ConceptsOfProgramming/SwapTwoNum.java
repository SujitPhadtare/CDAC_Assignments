package day1lab;
//3:Write a program to swap two numbers.

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		int num1, num2, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to swap : ");
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		System.out.print("num2 : ");
		num2 = sc.nextInt();

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping numbers are : ");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		sc.close();
	}
}