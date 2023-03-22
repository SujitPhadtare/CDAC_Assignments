package day1lab;
/*12:Sum of series :
1+2+3+….+n*/

import java.util.Scanner;

public class SeriesSum {
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		num = sc.nextInt();

		if (num <= 0) {
			System.out.println("Enter valid integer");
		} else {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("The sum of first " + num + " integers is : " + sum);
			sc.close();
		}

	}
}