package practices;

import java.util.Scanner;

public class DivisibleByTwoFourTotal {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number;
        int total =0 ;
        System.out.println("Please enter numbers");
        while ((number=keyboard.nextInt())%2 ==0){
            if (number % 4 == 0){
                total+=number;
            }
        }

        System.out.println("Total: "+ total);

    }
}
