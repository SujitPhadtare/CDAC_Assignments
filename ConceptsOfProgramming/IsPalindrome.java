import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		int num1 = num;
		int temp = 0;
//		boolean flag = true;
		while(true)
		{
			temp += num1%10;
			num1 = num1/10;
			if(num1==0) {break;}
			temp *= 10;
		}
		
//		System.out.println(temp);

		
		
		if(num==temp)
		{
			System.out.println(num+" is a palindromic number.");
		}
		else
		{
			System.out.println(num+" is NOT a palindromic number.");
		}		
	}
}
