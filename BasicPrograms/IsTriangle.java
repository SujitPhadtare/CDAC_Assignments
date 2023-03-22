/*8. Write a  program to input angles of a triangle and check whether triangle is valid or not.*/
package day1lab;

import java.util.Scanner;

public class IsTriangle {
	public static void main(String[] args) {
		int a, b, c, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angles of tringle : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		sum = a + b + c;

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("One or more angles are not voalid.");
		} else if (sum == 180) {
			System.out.println("It is a valid triangle.");
		} else {
			System.out.println("It is NOT a valid triangle.");
		}
		sc.close();
	}
}