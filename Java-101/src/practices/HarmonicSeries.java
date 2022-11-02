package practices;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = keyboard.nextInt();

        double sum = 1;

        for (int i = 2; i <= n; ++i)
            sum += (double)1 / i;

        System.out.printf("Sum: %.3f", sum);
    }

}
