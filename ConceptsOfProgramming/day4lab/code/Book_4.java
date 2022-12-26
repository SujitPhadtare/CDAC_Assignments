/*4. Create a class Book with data members as bname,id,author,price. Write getters and setters
for all the data members. Also add the display function. Create Default and Parameterized constructors.
Create the object of this class in main method and invoke all the methods in that class.*/

package day4lab.code;

public class Book_4 {

	// tight encapsulation
	private String bname, author;
	private int id, price;

	// getters & setter

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// Constructors
	public Book_4() {
		bname = "Default";
		author = "Default";
		id = 0;
		price = 0;
	}

	public Book_4(String bname, String author, int id, int price) {
		this.bname = bname;
		this.author = author;
		this.id = id;
		this.price = price;
	}

	// display method
	public void displayDetails() {
		System.out.println("Book Name : " + bname);
		System.out.println("Author Name : " + author);
		System.out.println("Book ID : " + id);
		System.out.println("Book Price : " + price);

	}

}
