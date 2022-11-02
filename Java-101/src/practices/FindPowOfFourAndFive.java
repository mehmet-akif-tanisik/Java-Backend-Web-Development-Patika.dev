package practices;

import java.util.Scanner;

public class FindPowOfFourAndFive {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        int number = Integer.parseInt(keyboard.nextLine());

        System.out.println("pow of 4 until " + number);
        for (int i = 1; i <=number; i *= 4)
            System.out.println(i);


        System.out.println("pow of 5 until " + number);
        for (int i = 1; i <=number; i *= 5)
            System.out.println(i);
    }
}
