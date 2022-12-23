package day1lab;
/*
7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
(Hint: a, e, i, o, u are vowels)*/

import java.util.Scanner;

public class IsVowel
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase character : ");
        ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Entered character '"+ch+"' is a Vowel.");
        }
        else
        {
            System.out.println("Entered character '"+ch+"' is a Consonant.");
        }
        sc.close();
    }
}
