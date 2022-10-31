package practices;

import java.util.Scanner;

public class WeatherAdvisor {

    public static void main(String[] args) {
        int degree;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        degree = keyboard.nextInt();

        if (degree < 5) {
            System.out.println("You can ski today.");
        } else if (degree <= 25) {
            if (degree <= 15) {
                System.out.println("You can go to the cinema.");
            }
            if (degree>=10){
                System.out.println("You can go to the picnic.");
            }
        } else {
            System.out.println("You can go to swimming.");
        }







    }
}
