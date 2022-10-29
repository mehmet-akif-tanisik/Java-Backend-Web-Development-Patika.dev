package taxCalculatorProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double bill, taxPercentage, taxAmount, totalBill;
        taxPercentage = 0.18;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the amount of bill: ");
        bill = keyboard.nextDouble();

        if (bill>=1000){
            taxPercentage = 0.8;
        }

        taxAmount = bill * taxPercentage;
        totalBill = bill + taxAmount;

        System.out.printf("Bill : %.2f%n" +
                        "Tax Percentage: %.2f%n" +
                        "Tax amount: %.2f%n" +
                        "Total bill: %.2f",bill,taxPercentage,taxAmount,totalBill);



    }
}
