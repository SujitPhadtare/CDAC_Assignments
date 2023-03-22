//18:Write a program to find greatest of three numbers using nested if-else.
package day1lab;

import java.util.Scanner;

public class GreatestThreeNum {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

//      System.out.println();  

		if (a == b && a == c) {
			System.out.println("Three numbers are equal.");
		} else if (a >= b && a >= c) {
			System.out.println(a + " is the Greatest number.");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is the Greatest number.");
		} else if (c >= a && c >= b) {
			System.out.println(c + " is the Greatest number.");
		}
		sc.close();
	}
}