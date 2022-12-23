//11:Create application for method overloading

package day3lab;

public class MethodOverloading {

	static void add(int a, int b) {
		System.out.println("Sum of two integers = " + (a + b));
	}

	static void add(int a, int b, int c) {
		System.out.println("Sum of three integers = " + (a + b + c));
	}

	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
	}

}
