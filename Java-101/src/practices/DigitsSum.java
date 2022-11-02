package practices;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int val = keyboard.nextInt();

        int sum = 0;

        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }

        System.out.printf("Digits sum of number = %d%n", sum);
    }

}
