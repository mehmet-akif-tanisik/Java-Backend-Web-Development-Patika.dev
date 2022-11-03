package practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);
        while (right < 5) {
            System.out.print("Please make a guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You have entered too many wrong guesses. You can try : " + (5 - right) +" times more.");
                } else {
                    isWrong = true;
                    System.out.println("Your tries will be decreased next time.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("You got it ! Guess is : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You have entered a wrong number !");
                if (selected > number) {
                    System.out.println(selected + " is too Big!");
                } else {
                    System.out.println(selected + " is too Low!");
                }

                wrong[right++] = selected;
                System.out.println("Tries : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You have lost it ! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
                System.out.println("Number was " + number);
            }
        }

    }
}
