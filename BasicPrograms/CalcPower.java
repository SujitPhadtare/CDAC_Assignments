package basic;

import java.util.Scanner;

public class CalcPower {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			int num = sc.nextInt();
			System.out.println("Enter power : ");
			int pow = sc.nextInt();
			System.out.println("Answer -> stack height n     : " + calPower(num, pow));
			System.out.println("Answer -> stack height log n : " + calPowerLogn(num, pow));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// stack height = n
	private static double calPower(int num, int pow) {

		if (num == 0)
			return 0;
		if (pow == 0)
			return 1;
		if (pow < 0)
			return calPower(num, pow + 1) / num;
		if (pow > 0)
			return num * calPower(num, pow - 1);
		return -999;
	}

	// stack height = logn
	private static long calPowerLogn(int num, int pow) throws Exception {
		if(pow <0)
			throw new Exception("power is negative");
		if (num == 0)
			return 0;
		if (pow == 0)
			return 1;
		if (pow % 2 == 0)
			return calPowerLogn(num, pow / 2) * calPowerLogn(num, pow / 2);
		else
			return calPowerLogn(num, pow / 2) * calPowerLogn(num, pow / 2) * num;
	}

}
