package day4lab.client;

import day4lab.code.*;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per = new Person("Sujit", "Mumbai", 25);
		per.displayPerson();

		per.setName("Varadrajan");
		per.setCity("Nanded");
		per.setAge(25);
		per.displayPerson();
	}
}
