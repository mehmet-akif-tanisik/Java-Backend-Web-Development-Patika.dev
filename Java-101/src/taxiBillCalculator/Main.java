package taxiBillCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int distance;
        double perKm, totalBill, startingPrice;

        perKm = 2.20;
        startingPrice = 10;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter distance as km: ");
        distance = keyboard.nextInt();

        totalBill = (distance * perKm);
        totalBill += startingPrice;

        totalBill = (totalBill<20) ? 20 : totalBill;
        System.out.println("Total bill: " + totalBill);




    }

}
