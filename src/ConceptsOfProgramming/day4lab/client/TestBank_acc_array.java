/*
package day4lab.client;

import java.util.Scanner;

import day4lab.code.BankAccount_7;

public class TestBank_acc_array {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BankAccount_7[] bank = new BankAccount_7[5];
		int ch;
		int index = 0;

		System.out.println(
				"1.Create Account 2.Show All accounts 3.Search account 4.Edit account details 5.Withdraw 6.Deposit  7.Money Transfer 8.Exit");

		do {
			System.out.println("Select one option");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Name--Email--City--Amount");
				BankAccount_7 ac = new BankAccount_7(sc.next(), sc.next(), sc.next(), sc.nextInt());
				bank[index] = ac;
				bank[index].display();
				index++;
				break;
			case 2:
				System.out.println("Show all Account");
				for (int i = 0; i < index; i++) {
					bank[i].display();
				}

				break;
			case 3:
				System.out.println("Search Account");
				System.out.println("enter yout id");
				int id = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (bank[i].getId() == id) {
						bank[i].display();
					} else {
						System.out.println("account found");
					}
				}
				break;
			case 4:
				System.out.println("Edit account name : ");
				System.out.println("enter yout id");
				id = sc.nextInt();
				String name;
				boolean flag = false;
				for (int i = 0; i < index; i++) {
					if (bank[i].getId() == id) {
						System.out.println("Enter new name :");
						name = sc.next();
						bank[i].setName(name);
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.println("account not found");
				break;
			case 5:
				System.out.println("Withdraw amount");
				System.out.println("enter yout id");
				id = sc.nextInt();

				flag = false;
				for (int i = 0; i < index; i++) {
					if (bank[i].getId() == id) {
						bank[i].withdraw();
						bank[i].display();
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.println("account not found");

				break;
			case 6:
				System.out.println("Deposit amount");
				System.out.println("enter yout id");
				id = sc.nextInt();

				flag = false;
				for (int i = 0; i < index; i++) {
					if (bank[i].getId() == id) {
						bank[i].deposit();
						bank[i].display();
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.println("account not found");
				break;
			case 7:
				System.out.println("Money Transfer");
				System.out.println("enter your id");
				id = sc.nextInt();
				System.out.println("enter reciver id");
				int idr = sc.nextInt();
				int trans;
				flag = false;
				for (int i = 0; i < index; i++) {
					if (bank[i].getId() == id) {

						for (int j = 0; j < index; j++) {
							if (bank[j].getId() == idr) {
								System.out.println("Enter amount to transfer");
								trans = sc.nextInt();
								bank[i].withdraw(trans);
								bank[j].deposit(trans);
								bank[i].display();
								bank[j].display();
								flag = true;
								break;
							}
						}
						if (flag)
							break;
					}
				}
				if (!flag)
					System.out.println("account not found");
				break;

			case 8:
				System.out.println("Thank You");

				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (ch != 8);
	}

}
*/
