package practices;

import java.util.Scanner;

public class RecursiveFibonacciSeries {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter Fibonacci Series index to see value:");
        int index = keyboard.nextInt();


        System.out.println("Index: " + index + " Value: "+fibonacci(index));
    }


    public static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
