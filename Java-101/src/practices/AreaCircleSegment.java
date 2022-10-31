package practices;

import java.util.Scanner;

public class AreaCircleSegment {


    public static void main(String[] args) {

        int radius, centralAngle;
        double area, pi;

        pi = 3.14;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter radius of the circle: ");
        radius = keyboard.nextInt();

        System.out.print("Please enter central angle of the segment: ");
        centralAngle = keyboard.nextInt();

        area = (pi * (radius*radius) * centralAngle)/360.0;

        System.out.println("Area: " + area);



    }
}
