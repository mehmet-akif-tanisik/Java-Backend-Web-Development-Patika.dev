package practices;

import java.util.Scanner;

public class GradeCalculatorVersion2 {
    public static void main(String[] args) {

        int mathematics, physics, chemistry, turkish, music;
        double avarageGrade = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter grade of mathematics lecture: ");
        mathematics = keyboard.nextInt();

        System.out.print("Enter grade of physics lecture: ");
        physics = keyboard.nextInt();

        System.out.print("Enter grade of chemistry lecture: ");
        chemistry = keyboard.nextInt();

        System.out.print("Enter grade of turkish lecture: ");
        turkish = keyboard.nextInt();

        System.out.print("Enter grade of music lecture: ");
        music = keyboard.nextInt();


        if (mathematics>0 && mathematics<=100){
            avarageGrade += mathematics;
        }
        if (physics>0 && physics<=100){
            avarageGrade += physics;
        }
        if (chemistry>0 && chemistry<=100){
            avarageGrade += chemistry;
        }
        if (turkish>0 && turkish<=100){
            avarageGrade += turkish;
        }
        if (music>0 && music<=100){
            avarageGrade += music;
        }

        avarageGrade/=5;

        System.out.printf("Avarage grade of 6 courses : %.2f%n",avarageGrade);
        System.out.println( avarageGrade>=55 ? "Passed" : "Failed");


    }
}
