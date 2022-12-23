package day4lab.client;

import java.util.Scanner;

import day4lab.code.*;

public class TestBankAccount_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		BankAccount_7 ac = new BankAccount_7();
		ac.acceptDetails();

		do {
			System.out.println("\n1. Withdraw Money \n2. Deposit Money \n3. Show Balance \n4. Exit Transaction");
			System.out.print("Select one option : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				ac.withdraw();
				break;
			case 2:
				ac.deposite();
				break;
			case 3:
				ac.showBalance();
				break;
			case 4:
				System.out.println("Exit Selected");
				System.out.println("Thank you... Visit Again...");
				break;
			default:
				System.out.println("Invalid Choice... Try Again...");
				break;
			}

		} while (choice != 4);
		
		sc.close();
	}

}
