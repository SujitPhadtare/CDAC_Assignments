/*5. Create a class Point with data members as x,y. Create Default and Parameterized
constructors. Write getters and setters for all the data members. Also add the display function. Create the object of
this class in main method and invoke all the methods in that class.*/

package day4lab.code;

public class Point_5 {
	// tight encapsulation
	private int x, y;

	// getters & setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Constructors
	public Point_5() {
		x = 0;
		y = 0;
	}

	public Point_5(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void displayPoint() {
		System.out.println("The points are : ");
		System.out.println("x = " + x + "\ny = " + y);
	}
}
