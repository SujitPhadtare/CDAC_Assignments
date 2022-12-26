package day3lab;
//7:Write a java program to convert char array into String.

import java.util.Scanner;

public class CharArrayToStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of char array : ");
		int len = sc.nextInt();
		char ch[] = new char[len];
		System.out.println("Enter "+len+" characters : ");

		for (int i = 0; i < len; i++) {
			ch[i] = sc.next().charAt(0);
		}

		for (char c : ch) {
			System.out.print(c + " ");
		}
		
		String str = new String(ch);

//		System.out.println("ch = "+ch);
//		str = ch[len];
		System.out.println("\nstring = " + str);
		sc.close();

	}

}
