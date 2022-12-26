package day1lab;
//16:Write a  program to print all Prime numbers between 1 to n. 

import java.util.Scanner;

public class PrintAllPrimeSqrt {

	public static void main(String[] args) {

		int upLim;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		upLim = sc.nextInt();

		System.out.println("The prime numbers between 1 and " + upLim + " are : ");
		for (int num = 2; num <= upLim; num++) {
			boolean flag = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(num + " ");
			}
		}
		sc.close();
	}
}