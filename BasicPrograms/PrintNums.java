package basic;

public class PrintNums {

	public static void main(String[] args) {
		int num = 10;
		printNum(num);

	}

	private static void printNum(int num) {
		// TODO Auto-generated method stub
		if (num == 0)
			return;
		System.out.print(num + " ");
		printNum(num - 1);
		System.out.print(num + " ");
	}
}