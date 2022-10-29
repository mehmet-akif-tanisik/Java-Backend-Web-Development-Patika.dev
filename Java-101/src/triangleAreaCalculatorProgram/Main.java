package triangleAreaCalculatorProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;
        double area, u;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter edges of the triangle: ");

        System.out.print("a: ");
        a = keyboard.nextInt();

        System.out.print("b: ");
        b = keyboard.nextInt();

        System.out.print("c: ");
        c = keyboard.nextInt();

        u = (a+b+c) / 2.0;

        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.printf("Triangle with edges %d, %d, %d%n" +
                          "Area: %.2f cm square",a,b,c,area );





    }
}
