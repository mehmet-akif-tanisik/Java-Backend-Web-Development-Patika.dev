package homeworks;

import java.util.Scanner;

public class BmiCalculator {


    public static void main(String[] args) {

        //weight in kg, height in meters
        double weight, height;
        // basal metabolic rate
        double bmi;

        //keyboard variable is a Scanner object that will read input from keyboard.
        Scanner keyboard = new Scanner(System.in);

        //Taking inputs from user with "keyboard" Scanner object.
        System.out.print("Please enter your height(as meter e.q: 1.72): ");
        height = keyboard.nextDouble();

        System.out.print("Please enter your weight(as kilogram e.q: 76): ");
        weight = keyboard.nextDouble();

        //Basal Metabolic Rate = Weight(kg) / (Height(meters) * Height(meters))
        bmi = weight / (height*height);

        //Screen output to show basal metabolic rate of user.
        System.out.printf("Your BMI is: %.2f", bmi);


    }

}
