//15: Write a  program to enter a number and print its reverse.

package day1lab;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, revNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		num1 = num;

		while (true) {
			revNum += num1 % 10;
			num1 = num1 / 10;
			if (num1 == 0)
				break;
			revNum *= 10;
		}

		System.out.println("Reverse of " + num + " is '" + revNum + "'");
		sc.close();
	}

}