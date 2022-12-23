/*9:Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120*/
package day1lab;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int num;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = i * fact;
		}
		System.out.println("Factorial of " + num + " is : " + fact);
		sc.close();
	}
}
