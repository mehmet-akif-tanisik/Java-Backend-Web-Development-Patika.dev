package homeworks;

import java.util.Scanner;

public class BmiCalculator {


    public static void main(String[] args) {

        double weight, height; //weight in kg, height in meters
        double bmi;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your height(as meter e.q: 1.72): ");
        height = keyboard.nextDouble();

        System.out.print("Please enter your weight(as kilogram e.q: 76): ");
        weight = keyboard.nextDouble();

        bmi = weight / (height*height);

        System.out.printf("Your BMI is: %.2f", bmi);


    }

}
