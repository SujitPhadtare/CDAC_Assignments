
/*
8:Create array of BankAccount class  and store 5 objects....create menu  driven application for same.....ex. show all account  names ,balance,email...

package day4lab.code;

import java.util.Scanner;

public class Bank_acc_array {

	private int id, amt;
	private String name, email, city;
	private static int counter;
	static {
		counter = 1001;
	}
	Scanner sc = new Scanner(System.in);

public BankAccount()
{

}

public BankAccount(String name,String email,String city,int amt)
{
this.id=counter;
this.amt=amt;
this.name=name;
this.email=email;
this.city=city;
counter++;

}

	public int getId() {
		return id;
	}

	public int getAmt() {
		return amt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {
		System.out.println(id + " " + name + " " + email + " " + city + " " + amt);
	}

	public void withdraw() {
		System.out.println("enter amount to withdraw");

		amt = amt - sc.nextInt();

		System.out.println("updated balance is=" + amt);

	}

	public void deposit() {
		System.out.println("enter amount to deposit");
		amt = amt + sc.nextInt();
		System.out.println("updated balance is=" + amt);

	}

	public void showbalance() {
		System.out.println("balance is=" + amt);
	}

	public void deposit(int amt) {
		this.amt = this.amt + amt;
	}

	public void withdraw(int amt) {
		this.amt = this.amt - amt;
	}

}
*/
