package homeworks;

import java.util.Scanner;

public class GroceryStoreBillCalculator {

    public static void main(String[] args) {

        // Declaration of products and total bill amount
        double apple, pear, tomato, eggplant, banana, billAmount;

        //Initializing "keyboard" object from Scanner class that will read input from keyboard.
        Scanner keyboard = new Scanner(System.in);

        //Taking inputs apple, pear, tomato, eggplant and banana kilograms as double from user using "keyboard" object.
        System.out.print("Apple kg: ");
        apple = keyboard.nextDouble();

        System.out.print("Pear kg: ");
        pear = keyboard.nextDouble();

        System.out.print("Tomato kg: ");
        tomato = keyboard.nextDouble();

        System.out.print("Eggplant kg: ");
        eggplant = keyboard.nextDouble();

        System.out.print("Banana kg: ");
        banana = keyboard.nextDouble();

        //Calculation of total bill amount and initialize it to billAmount variable.
        billAmount = (apple * 3.67) + (pear * 2.14) + (tomato * 1.11) + (eggplant * 5) + (banana * 0.95);

        //Screen output to show total amount of bill.
        System.out.print("Total bill amount: " + billAmount);


    }
}
