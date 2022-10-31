package practices;

import java.util.Scanner;

public class SortThreeNumbers {

    public static void main(String[] args) {

        int a,b,c;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        a = keyboard.nextInt();

        System.out.print("Please enter number 2: ");
        b = keyboard.nextInt();

        System.out.print("Please enter number 3: ");
        c = keyboard.nextInt();
        int temp;

        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if (a>c){
            temp = a;
            a = c;
            c = temp;
        }
        if (b>c){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " " + b + " " + c );




    }
}
