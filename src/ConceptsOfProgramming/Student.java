/*2:Write a program which will accept student information 
 like rollno,name,5 subject marks.calculate total and percentage.
 calculate grade.. */

package day3lab;

import java.util.Scanner;

public class Student {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll number : ");
		int rollno = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter marks of five subject : ");
//		int marks[] = new int[5];
		for (int i = 0; i < 5; i++) {
			total += sc.nextInt();
		}

		System.out.println("Total marks = " + total);
		float per = (float) total / 5;
		System.out.println("Percentage  = " + per);
		System.out.print("Grade = ");

		if (per >= 75 && per <= 100) {
			System.out.print("A");
		} else if (per < 75 && per >= 60) {
			System.out.print("B");
		} else if (per < 59 && per >= 0) {
			System.out.print("C");
		} else {
			System.out.println("Enter valid percentage");
		}

		sc.close();
	}

}
