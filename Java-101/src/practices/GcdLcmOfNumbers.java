package practices;

import java.util.Scanner;

public class GcdLcmOfNumbers {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        System.out.print("Number1: ");
        int x = keyboard.nextInt();
        System.out.print("Number2: ");
        int y = keyboard.nextInt();

        System.out.println("The GCD of two numbers is: " + gcd(x, y));
        System.out.println("The LCM of two numbers is: " + lcm(x, y));
    }
    static int gcd(int x, int y)
    {
        int r, a, b;
        a = Math.max(x, y);
        b = Math.min(x, y);

        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int lcm(int x, int y)
    {
        int a;
        a = Math.max(x, y);
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }
    }
}
