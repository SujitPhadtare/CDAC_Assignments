/*6:create BankAccount application for operations like withdraw ,deposit and ShowBalance
Create menu drive program for bank operations..*/

package day4lab.code;

import java.util.Scanner;

public class BankAccount_7 {
	Scanner sc = new Scanner(System.in);
	private double balance, withdraw, deposit;
	private int accNum;
	private String name;

	public BankAccount_7() {
		balance = 10000;
	}

	public void acceptDetails() {
		System.out.println("Enter account number : ");
		accNum = sc.nextInt();
	}

	public int withdraw() {
		System.out.println("Enter amount to withdraw (only 100 denomination): ");
		withdraw = sc.nextInt();
		boolean flag = oneH(withdraw);
		if (!flag) {
			return 0;
		}
		if (balance > withdraw) {
			balance -= withdraw;
			System.out.println("Transaction successful");
			System.out.println("Updated Account balance : " + balance);
		} else {
			System.out.println("Insufficient account balance... Transaction failed");
		}
		return 0;
	}

	public int deposite() {
		System.out.println("Enter amount to deposit (only 100 denomination): ");
		deposit = sc.nextInt();
		boolean flag = oneH(withdraw);
		if (!flag) {
			return 0;
		}
		balance += deposit;
		System.out.println("Updated Account balance : " + balance);
		return 0;
	}

	public void showBalance() {
		System.out.println("Balance is : " + balance);
	}

//	public void displayDetails() {
//		
//	}

//*******************************************

	public boolean oneH(double amt) {
		if (amt % 100 == 0) {
			return true;
		} else {
			System.out.println("Entered amount is invalid ");
			return false;
		}
	}

}
