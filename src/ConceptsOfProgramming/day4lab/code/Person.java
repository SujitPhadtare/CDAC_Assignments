/*2. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class. 
*/

package day4lab.code;

import java.util.Scanner;

public class Person {

	Scanner sc = new Scanner(System.in);
	private String name, city;
	private int age;

	// getter & setter

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, String city, int age) {
		this();
		System.out.println("This is Parametrised Constructor");
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Person() {
		System.out.println("This is Default Constructor");
	}

	public void displayPerson() {
		System.out.println("Name : " + getName());
		System.out.println("City : " + getCity());
		System.out.println("Age : " + getAge());
	}

}
