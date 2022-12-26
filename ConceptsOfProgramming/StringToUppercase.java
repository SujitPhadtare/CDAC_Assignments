//8:Write a program to accept array of string.Display all elements in uppercase.

package day3lab;

import java.util.Scanner;

public class StringToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of string array : ");
		int len = sc.nextInt();
		String[] str = new String[len];
		String[] upStr = new String[len];
		System.out.println("Enter string elements : ");
		
		for(int i=0;i<len;i++) {
			str[i] = sc.next();
			upStr[i] = str[i].toUpperCase();
		}
		for(String s:upStr)
		System.out.print(s+" ");
		sc.close();
	}

}
