package gradeCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mathematics, physics, chemistry, turkish, history, music;
        double avarageGrade;

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter grade of mathematics lecture: ");
        mathematics = keyboard.nextInt();

        System.out.print("Enter grade of physics lecture: ");
        physics = keyboard.nextInt();

        System.out.print("Enter grade of chemistry lecture: ");
        chemistry = keyboard.nextInt();

        System.out.print("Enter grade of turkish lecture: ");
        turkish = keyboard.nextInt();

        System.out.print("Enter grade of history lecture: ");
        history = keyboard.nextInt();

        System.out.print("Enter grade of music lecture: ");
        music = keyboard.nextInt();

        avarageGrade = (mathematics + physics + chemistry + turkish + history + music) / 6.0;

        System.out.printf("Avarage grade of 6 courses : %.2f%n",avarageGrade);
        System.out.println( avarageGrade>=60 ? "Passed" : "Failed");




    }
}
