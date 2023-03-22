package day1lab;

//2:Write a program to adddition of two numbers .

import java.util.Scanner;
public class AddTwoNum
{
    public static void main(String[] args)
    {
        int num1,num2;
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("The sum is : "+(num1+num2));
        sc.close();
    }

}