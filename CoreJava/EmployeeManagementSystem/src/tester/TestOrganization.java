package tester;

import java.util.Scanner;

import com.app.org.*;
import static utils.NameValidation.*;
import customExceptions.DuplicateNameException;

public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many employees you want to hire : ");
			int size = sc.nextInt();
			int choice = 0;
			int index = 0;
			int i = 0;
			// Array of employee class
			Emp[] emp = new Emp[size];
			System.out.println("Welcome to VS.pvt.ltd");
			while (choice != 10) {
				// Options Menu
				System.out.println(
						"\n1. Hire Manager \n2. Hire Worker \n3. Display Employee Details \n4. Update Basic Salary \n10. Exit");
				System.out.println("Enter Your Choice : ");
				choice = sc.nextInt();
try{
				switch (choice) {

				case 1:
					// Hire Manager
					System.out.println("Enter Manager Details");
					System.out.println("fname--lname--deptId--basicSalary--perfBonus");
					String fname = sc.next();
					String lname = sc.next();
					if (validateName(fname, lname, emp)) {
						emp[index] = new Mgr(fname, lname, sc.nextInt(), sc.nextDouble(), sc.nextDouble());
						index++;
					}
					break;
				case 2:
					// Hire Worker
					System.out.println("Enter Worker Details");
					System.out.println("fname--lname--deptId--basicSalary--hoursWorked--hoursRate");
					fname = sc.next();
					lname = sc.next();
					if (validateName(fname, lname, emp)) {
					emp[index] = new Worker(fname, lname, sc.nextInt(), sc.nextDouble(), sc.nextInt(),
							sc.nextDouble());
					index++;}
					break;
				case 3:
					// Display all Employee Details
					for (Emp e : emp) {
						if (e != null)
							System.out.println(e.toString() + ", Net sal = " + e.computeNetSalary());
//							System.out.println(e);
					}
					break;
				case 4:
					// Increment salary of given Employee
					System.out.println("Enter empId(int) and salary increment(double) : ");
					int empId = sc.nextInt();
					double inc = sc.nextDouble();
					boolean flag = false;
					for (i = 0; i < index; i++) {
						if (empId == emp[i].getEmpId()) {
							double sal = emp[i].getBasicSalary();
							System.out.println("Old sal " + emp[i].getBasicSalary());
							emp[i].setBasicSalary(sal + inc);
							System.out.println("Salary updated !!!");
							System.out.println("New sal " + emp[i].getBasicSalary());
							flag = true;
							break;
						}
					}
					// Flag==false => invalid emp id
					if (!flag) {
						System.out.println("INVALID Employee Id\n");
					}
					break;
				case 5:
					// Fire Employee
					System.out.println("Enter Employee Id : ");
					empId = sc.nextInt();
					for (i = 0; i < index; i++) {
						if (emp[i].getEmpId() == empId) {
							emp[i] = null;
							break;
						}
					}
					for (int j = i; j < index - 1; j++) {
						emp[j] = emp[j + 1];
					}
					emp[index - 1] = null;
					index--;
					break;
//				case 6:
//					
//					break;
				case 10:
					System.out.println("Exit Selected !!");
					break;

				default:
					System.out.println("Invalid Choice.. Please Try Again..");
				}				} catch (Exception e) {
					e.printStackTrace();
					// there may be some pending i/ps : read them off
					sc.nextLine();
				}


			}
		}
	}

}

/*
 * MANAGER fname--lname--deptId--basicSalary--perfBonus s s 1 1000 10 
 * a a 1 2000 10
 * 
 * WORKER fname--lname--deptId--basicSalary--hoursWorked--hoursRate q q 2 1000 8 100 
 * r r 2 200 6 100
 */