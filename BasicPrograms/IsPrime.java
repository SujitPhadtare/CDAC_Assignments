/*11:Check if number is a prime number or not.: */
package day1lab;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		int num, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		if (num == 2) {
			System.out.println("2 is a prime number");
		} else if (num % 2 == 0) {
			System.out.println(num + " is NOT a prime number.");
		} else {
			for (int i = 3; i < num; i = i + 2) {
				if (num % i == 0) {
					System.out.println(num + " is NOT a prime number.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is a prime number.");
			}
		}
		sc.close();
	}
}