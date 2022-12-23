/*1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display using display member function.
Also display total,percentage and grade.*/
package day4lab.code;

import java.util.Scanner;

public class Date_3 {

	Scanner sc = new Scanner(System.in);

	// data members
	private int dd, mm, yy;

	public int getDD() {
		return dd;
	}

	public void setDD(int dd) {
		this.dd = dd;
	}

	public int getMM() {
		return mm;
	}

	public void setMM(int mm) {
		this.mm = mm;
	}

	public int getYY() {
		return yy;
	}

	public void setYY(int yy) {
		this.yy = yy;
	}
	
	public void displayDate() {
		System.out.println("Entered date is : "+dd+"/"+mm+"/"+yy);		
	}

	//Default constructor
	public Date_3(){
		dd=1;mm=1;yy=1111;
	}
	public Date_3(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
}
