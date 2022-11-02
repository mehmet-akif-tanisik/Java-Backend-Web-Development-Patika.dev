package practices;

import java.util.Scanner;

public class DivisibleByThreeFourAvarage {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a limit number: ");
        int limit = keyboard.nextInt();
        int total = 0;
        int counter = 0;


        for (int i=1 ; i<=limit; i++){
            if (i%3==0 && i%4==0){
                total+=i;
                counter++;
            }
        }

        System.out.printf("Average of %d numbers: %.2f",counter, (double)(total/counter));

    }
}
