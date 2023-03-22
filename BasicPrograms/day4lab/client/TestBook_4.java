package day4lab.client;

import day4lab.code.*;

public class TestBook_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book_4 book = new Book_4();
		System.out.println("Default Constructor");
		book.displayDetails();
		System.out.println("\nUsing setters ");
		book.setBname("Kimayagar");
		book.setAuthor("Achyut Godbole");
		book.setId(9594);
		book.setPrice(500);
		book.displayDetails();
	}

}
