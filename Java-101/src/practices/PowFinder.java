package practices;

import java.util.Scanner;

public class PowFinder {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        for (;;) {
            System.out.print("Base: ");
            int a = keyboard.nextInt();

            if (a == 0)
                break;

            System.out.print("Power: ");
            int n = keyboard.nextInt();

            System.out.println((int)Math.pow(a, n));
        }
    }

}
