package day1lab;
import java.util.Scanner;

public class InstantPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qty,choice;
		int amt = 0, totalAmt = 0,cgst=0,sgst=0,dis=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
		System.out.println("   WELCOME TO INSTANTPIZZA\n");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
		System.out.println("*********** Menu ************\n");
		System.out.println(
				" 1. Indiana Masala (Rs. 299) \n 2. Paneer Overloaded (Rs. 399)\n 3. Veg Delight (Rs. 499)\n 4. Premium Cheese Paradise (Rs. 599) \n 5. Proceed to Billing\n");
		System.out.println("Flat 10% discount on order above Rs.2000");

		do {
			System.out.println("Select your Pizza : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				amt += 299 * qty;
				break;
			case 2:
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				amt += 399 * qty;
				break;
			case 3:
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				amt += 499 * qty;
				break;
			case 4:
				System.out.println("Enter Quantity : ");
				qty = sc.nextInt();
				amt += 599 * qty;
				break;
			case 5:
				System.out.println("Billing.....");
				System.out.println("Taxable Amount  = Rs." + amt);
				cgst = (int)(0.09*amt);
				System.out.println("CGST(9%)	= Rs." +cgst);
				sgst = (int)(0.09*amt);
				System.out.println("SGST(9%)	= Rs." + sgst);

				if (amt > 2000) {
					System.out.println("You are eligible for FLAT 10% discount");
					dis = (int)(0.1 * amt);
					System.out.println("Discount	= (Rs. " + (int)dis +")");
				}
				totalAmt = amt+cgst+sgst-dis;
				System.out.println("Total Amount    = Rs." + (int)totalAmt);

				System.out.println("\nThank You... ViSiT AgAiN...");
				break;
			default:
				System.out.println("Invalid choice.. Try Again..");
				break;
			}
		} while (choice != 5);
		sc.close();
	}
}