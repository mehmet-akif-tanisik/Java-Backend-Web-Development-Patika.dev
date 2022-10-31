package practices;

import java.util.Scanner;

public class AreaAndCircumferenceCircle {


    public static void main(String[] args) {

        int radius;
        double area, circumference, pi;
        pi = 3.14;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter radius of the circle: ");
        radius = keyboard.nextInt();

        area = pi * radius * radius;
        circumference = 2 * pi * radius;

        System.out.printf("Area of circle: %.2f%n" +
                           "Circumference of circle: %.2f",area,circumference );

    }
}
