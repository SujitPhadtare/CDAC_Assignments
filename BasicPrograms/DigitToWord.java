//20:Accept a single digit from the user and display it in words
package day1lab;

import java.util.Scanner;

public class DigitToWord
{
  public static void main(String[] args)
  {        
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a single digit number : ");
      num = sc.nextInt();

      System.out.print("In words : ");

      switch(num)
      {
          case 0 :
              System.out.print("ZERO");
              break;
          case 1 :
              System.out.print("ONE");
              break;
          case 2 :
              System.out.print("TWO");
              break;
          case 3 :
              System.out.print("THREE");
              break;
          case 4 :
              System.out.print("FOUR");
              break;
          case 5 :
              System.out.print("FIVE");
              break;
          case 6 :
              System.out.print("SIX");
              break;
          case 7 :
              System.out.print("SEVEN");
              break;
          case 8 :
              System.out.print("EIGHT");
              break;
          case 9 :
              System.out.print("NINE");
              break;
          default :
              System.out.print("Not a single digit number.");
              break;
      }

      System.out.println("\n------END------");     
sc.close();
  }
}