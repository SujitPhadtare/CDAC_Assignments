package day1lab;
//21. Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the corresponding operation and displays the result.

import java.util.Scanner;

public class MathOp {
	public static void main(String[] args) {
		int int1, int2;
		float result;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two intgers : ");
		int1 = sc.nextInt();
		int2 = sc.nextInt();

		System.out.println("Enter one operator(+-*/) : ");
		ch = sc.next().charAt(0);

		switch (ch) {
		case '+':
			result = int1 + int2;
			System.out.println("The sum of two integers is : " + result);
			break;
		case '-':
			result = int1 - int2;
			System.out.println("The difference between two integers is : " + result);
			break;
		case '*':
			result = int1 * int2;
			System.out.println("The product of two integers is : " + result);
			break;
		case '/':
			result = (float) int1 / int2;
			System.out.println("The quotient is : " + result);
			break;
		default:
			System.out.println("Enter valid character");
			break;
		}

		sc.close();

	}
}