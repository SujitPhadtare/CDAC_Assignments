package day7lab;

import java.util.Scanner;

public class Date_1 {

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
		System.out.println(dd + "/" + mm + "/" + yy);
	}

	// Default constructor
	public Date_1() {
		dd = 1;
		mm = 1;
		yy = 1;
	}

	public Date_1(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date_1 date = new Date_1();
		System.out.println("--Default Constructor--");
		date.displayDate();
		
		System.out.println("\n----------------------\n");

		Date_1 date2 = new Date_1(01, 01, 1997);
		date2.displayDate();

	}

}
