package day1lab;
/*6. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
Income tax as per the following rules. 
Basic: < 1, 50,000 Tax = 0
 1, 50,000 to 3,00,000 Tax = 20% 
 > 3,00,000 Tax = 30%*/

import java.util.Scanner;

public class SalaryTax {
	public static void main(String[] args) {
		double basicSalary, tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter annual basic salary of employee : ");
		basicSalary = sc.nextDouble();

		if (basicSalary >= 0 && basicSalary < 150000) {
			tax = 0.0;
		} else if (basicSalary >= 150000 && basicSalary <= 300000) {
			tax = 0.2 * basicSalary;
		} else if (basicSalary > 300000) {
			tax = 0.3 * basicSalary;
		} else {
			System.out.println("Enter valid salary");
//            exit;
		}

		System.out.println("Income Tax on the salary : Rs. " + tax);
		sc.close();
	}
}