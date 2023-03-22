/*1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade
*/

package day4lab.code;

import java.util.Scanner;

public class Student {

//	static {
//		System.out.println("This is static block ");
//	}

	static Scanner sc = new Scanner(System.in);
	public int rollno;
	private int marks[] = new int[3];

	public void acceptInfo() {
		System.out.print("Enter Student's Roll number :");
		rollno = sc.nextInt();
		System.out.println("\nEnter marks of three subjects :");
		for (int i = 0; i <= 2; i++) {
			marks[i] = sc.nextInt();
		}
	}

	public void displayInfo() {
		System.out.println("Student's Roll number is : " + rollno);
		System.out.println("Marks of three subjects :");
		for (int i : marks) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public double calculateTotal() {
		double total = 0;
		for (int i : marks) {
			total += i;
		}
		return total;
	}

	public void displayTotal() {
		System.out.println("Total marks =" + calculateTotal());
	}

	public double calPercent() {
		return calculateTotal() / 3;
	}

	public void displayPercent() {
		System.out.println("Percentage = " + calPercent());
	}

	public void displayGrade() {
		if (calPercent() >= 75) {
			System.out.println("A grade");
		} else if (calPercent() < 75 && calPercent() >= 60) {
			System.out.println("B grade");
		} else if (calPercent() < 60 && calPercent() >= 40) {
			System.out.println("C grade");
		} else {
			System.out.println("FAIL");
		}

	}
}
