package homeworks;

import java.util.Scanner;

public class GroceryStoreBillCalculator {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double apple, pear, tomato, eggplant, banana, billAmount;

        System.out.print("Apple kg: ");
        apple = kb.nextDouble();

        System.out.print("Pear kg: ");
        pear = kb.nextDouble();

        System.out.print("Tomato kg: ");
        tomato = kb.nextDouble();

        System.out.print("Eggplant kg: ");
        eggplant = kb.nextDouble();

        System.out.print("Banana kg: ");
        banana = kb.nextDouble();

        billAmount = (apple * 3.67) + (pear * 2.14) + (tomato * 1.11) + (eggplant * 5) + (banana * 0.95);

        System.out.print("Total bill amount: " + billAmount);


    }
}
