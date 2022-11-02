package homeworks;

import java.util.Scanner;

public class PerfectNumberFinder {

        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            int val = keyboard.nextInt();

            int sum = 0;

            for (int i = 1; i <= val / 2; ++i) {
                if (val % i == 0)
                    sum += i;
            }

            System.out.println(sum == val ? "Perfect Number!" : "Not a Perfect Number!");



            System.out.print("Please enter a number: ");
            int val2 = keyboard.nextInt();

            int sum2 = 0;

            for (int i = 1; i <= val2 / 2; ++i) {
                if (val2 % i == 0)
                    sum2 += i;
            }

            System.out.println(sum2 == val2 ? "Perfect Number!" : "Not a Perfect Number!");



            System.out.print("Please enter a number: ");
            int val3 = keyboard.nextInt();

            int sum3 = 0;

            for (int i = 1; i <= val3 / 2; ++i) {
                if (val3 % i == 0)
                    sum3 += i;
            }

            System.out.println(sum3 == val3 ? "Perfect Number!" : "Not a Perfect Number!");





        }
}
