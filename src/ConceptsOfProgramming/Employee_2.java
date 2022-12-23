/*2:Create Employee class with members id(int),name(string),dob(Date).
Use above created Date class. Write default and parameterised constructor 
in Employee Class.Write accept() function to accept information and 
display() to display emp information.
*/

package day7lab;

import java.util.Scanner;

public class Employee_2 {
	int id;
	String name;
	Date_1 dob;
	Scanner sc = new Scanner(System.in);

	public Employee_2() {
		this.id = 0;
		this.name = "null";
		this.dob = new Date_1();
	}

	public Employee_2(int id, String name, Date_1 dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public void accept() {
		System.out.println("Enter Employee ID : ");
		this.id = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		this.name = sc.next();
		System.out.println("Enter Employee Birth date(dd mm yy) : ");
		dob = new Date_1(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}

	public void displayEmp() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.print("Employee Birth date : ");
		this.dob.displayDate();

	}

	public static void main(String[] args) {
		System.out.println("-----Default Constructor-----");
		Employee_2 emp = new Employee_2();
		emp.displayEmp();

		System.out.println("\n----------------------\n");

		Employee_2 emp2 = new Employee_2();
		emp2.accept();
		emp2.displayEmp();
	}
}
