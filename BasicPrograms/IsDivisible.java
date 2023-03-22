//5. Write a program to accept a number and check if it is divisible by 5 and 7.

package day1lab;

import java.util.Scanner;

public class IsDivisible {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();

		if (num % 5 == 0)
			System.out.println(num + " is divisible by 5.");
		else
			System.out.println(num + " is NOT divisible by 5.");

		if (num % 7 == 0)
			System.out.println(num + " is divisible by 7.");
		else
			System.out.println(num + " is NOT divisible by 7.");
		sc.close();
	}

}