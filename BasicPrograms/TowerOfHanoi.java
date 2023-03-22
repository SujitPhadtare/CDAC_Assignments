package basic;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter height of tower : ");
			int height = sc.nextInt();
			toh(height, 'S', 'H', 'D');
		}

	}

	private static void toh(int height, char S, char H, char D) {
		if (height == 1) {
			System.out.println("Transfer disk " + height + " from " + S + " to " + D);
			return;
		}

		toh(height - 1, S, D, H);
		System.out.println("Transfer disk " + height + " from " + S + " to " + D);
		toh(height - 1, H, S, D);
	}

}
