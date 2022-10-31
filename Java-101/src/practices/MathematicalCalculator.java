package practices;

import java.util.Scanner;

public class MathematicalCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int a = keyboard.nextInt();

        System.out.print("Please enter second number: ");
        int b = keyboard.nextInt();


        System.out.println("""
                Please choose operation:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division""");
        System.out.print("Enter your operation number: ");
        int operationInput = keyboard.nextInt();

        switch (operationInput){
            case 1:
                System.out.printf("%d + %d = %d", a, b, (a+b));
                break;
            case 2:
                System.out.printf("%d - %d = %d", a, b, (a-b));
                break;
            case 3:
                System.out.printf("%d * %d = %d", a, b, (a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.printf("%d / %d = %.2f", a, b, (a/(double)b));
                } else {
                    System.out.println("You can not divide by 0.");
                }
                break;
            default:
                System.out.println("Invalid operation number...");

        }




    }
}
