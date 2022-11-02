package practices;

import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("n :");
        int n = keyboard.nextInt();

        System.out.print("r :");
        int r = keyboard.nextInt();

        int combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("=> " + combination);

    }
    public static int factorial(int value)
    {
        for (int i = value - 1; 0 < i; --i)
            value *= i;

        return value;
    }
}
