package day3lab;

/*4:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 Rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchased items. 
*/
import java.util.Scanner;

public class StationaryShop {
	static Scanner sc = new Scanner(System.in);

	static int setqty() {
		int qty;
		System.out.println("Enter Quantity : ");
		qty = sc.nextInt();
		return qty;
	}

	public static void main(String[] args) {
		int choice;
		int amt = 0;
		System.out.println("*********** Items ************\n");
		System.out.println(
				" 1. Pen (Rs. 10) \n 2. Pencil (Rs. 5)\n 3. Notebook (Rs. 20)\n 4. Bottle (Rs. 30) \n 5. ColorBox (Rs. 50)\n 6. Proceed to Billing\n");

		do {
			System.out.println("Select an item from the list : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				amt += 10 * setqty();
				break;
			case 2:
				amt += 5 * setqty();
				break;
			case 3:
				amt += 20 * setqty();
				break;
			case 4:
				amt += 30 * setqty();
				break;
			case 5:
				amt += 50 * setqty();
				break;
			case 6:
				System.out.println("Billing.....\n");
				System.out.println("Total Amount = Rs." + amt);

				System.out.println("\nThank You... ViSiT AgAiN...");
				break;
			default:
				System.out.println("Invalid choice.. Try Again..");
				break;
			}
		} while (choice != 6);
		sc.close();
	}
}