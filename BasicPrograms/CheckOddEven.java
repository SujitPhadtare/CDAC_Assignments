package day1lab;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
//	        System.out.print((-3)%2);
		num = sc.nextInt();

		switch ((num) % 2) {
		case 0:
			System.out.println(num + " is an EVEN number.");
			break;
		case 1:
			System.out.println(num + " is an ODD number.");
			break;
		case -1:
			System.out.println(num + " is an ODD number.");
			break;
		default:
			System.out.println("Enter valid number.");
			break;
		}// switch((num)%2)
		sc.close();

	}

}
