package basic;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter initial two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Enter number of terms : ");
			int num = sc.nextInt();

			System.out.print(a + " " + b);
			printFib(a, b, num - 2);
		}
	}

	private static void printFib(int a, int b, int num) {
		// TODO Auto-generated method stub
		if (num == 0) {
			return;
		}
		int c = a + b;
		System.out.print(" " + c);
		printFib(b, c, num - 1);
	}
}
