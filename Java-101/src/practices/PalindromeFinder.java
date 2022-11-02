package practices;

import java.util.Scanner;

public class PalindromeFinder {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number to see if its Palindrome: ");
        int number = keyboard.nextInt();

        System.out.println(number +" isPalindrome ? "+isPalindrome(number));
        System.out.println();
        System.out.print("Enter a number to see if its Palindrome: ");
        int number2 = keyboard.nextInt();

        System.out.println(number2 +" isPalindrome ? "+isPalindrome(number2));
    }

    public static boolean isPalindrome(int number)
    {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber;
    }
}
