package day1lab;

/*10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3*/

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int m, n, n1;
		float pow = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base integer : ");
		m = sc.nextInt();
		System.out.println("Enter exponent : ");
		n = sc.nextInt();

		if (n == 0) {
			pow = 0;
		} else if (n > 0) { // int pow = 1;
			for (int i = 1; i <= n; i++) {
				pow = pow * m;
			}
		} else { // float pow = 1;
			n1 = -n;
			for (int i = 1; i <= n1; i++) {
				pow = pow * ((float) 1 / m);
			}
		}

		System.out.println(m + " raised to " + n + " is : " + pow);
		sc.close();
	}
}