package day1lab;
//14:Write a  program to find sum of all even and odd numbers between 1 to n. 

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0, sumEven = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num / 2; i++) {
			sumEven += 2 * i;
		}
		for (int i = 1; i <= (num / 2) + 1; i++) {
			sumOdd += 2 * i - 1;
		}
		System.out.println("Sum of Even numbers between 1 to " + num + " = " + sumEven);
		System.out.println("Sum of Odd numbers between 1 to " + num + "  = " + sumOdd);
		sc.close();
	}
}