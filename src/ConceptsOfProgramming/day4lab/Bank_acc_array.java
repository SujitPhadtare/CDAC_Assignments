
/*
8:Create array of BankAccount class  and store 5 objects....create menu  driven application for same.....ex. show all account  names ,balance,email...
*/
package Day7Lab1;

import java.util.Scanner;


public class BankAccount {
private  int id,amt;
private String name,email,city;
private static int counter;
  static {
  counter = 1001;
  }
Scanner sc= new Scanner(System.in);

 
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

public void display(){
System.out.println(id+" " +name+" " +email+" "+city+" "+amt);
}
public void withdraw() {
System.out.println("enter amount to withdraw");

amt=amt-sc.nextInt();

System.out.println("updated balance is="+amt);


}
public void deposit()
{
System.out.println("enter amount to deposit");
amt=amt+sc.nextInt();
System.out.println("updated balance is="+amt);

}
public void showbalance() {
System.out.println("balance is="+amt);
}
public void deposit(int amt) {
this.amt=this.amt + amt;
}
public void withdraw(int amt) {
this.amt=this.amt - amt;
}




}





package TestDay7Lab1;

import Day7Lab1.BankAccount;
import java.util.Scanner;

public class TestBankArray {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

BankAccount[] bank = new BankAccount[5];
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
BankAccount ac = new BankAccount(sc.next(), sc.next(), sc.next(), sc.nextInt());
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
