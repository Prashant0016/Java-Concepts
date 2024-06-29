/*
- The Scanner Class is used to take input from the user in java.
- The System.in part tells the Scanner to read input from the keyboard.
- sc.next() method to read the next piece of text (a word) that the user types and stores in a variable .
- sc.nextInt() method to read the number/integer that user types and stores in a variable

 */


package Basic_Intro;

import java.util.Scanner;                                 // Importing Scanner class or we can type * instead of Scanner

public class Taking_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);              // Creating object of Scanner class and saving in sc variable
        System.out.print("Enter your name : ");           // Printing Line before the input
        String a = sc.next();                             // Taking the input and storing in a variable
        System.out.println("Your name is : " + a);        // Printing the name via a .

        // Prog of addition of any two no
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter First no : ");            // Taking 1st no from user
        int b = sc2.nextInt();
        System.out.print("Enter Second no : ");           // Taking 2nd no from user
        int c = sc2.nextInt();
        int d = b+c;                                        // Logic for addition
        System.out.println("Sum of entered no is : " + d);  // Printing the result
    }
}
