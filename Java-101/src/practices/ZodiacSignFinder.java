package practices;

import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your birth month as number(1-12): ");
        int month = keyboard.nextInt();

        System.out.print("Please enter your birth day as number(1-31): ");
        int day = keyboard.nextInt();

        String zodiacSign="";

        if (month == 12){

            if (day < 22)
                zodiacSign = "Sagittarius";
            else
                zodiacSign ="Capricorn";
        }

        else if (month == 1){
            if (day < 20)
                zodiacSign = "Capricorn";
            else
                zodiacSign = "Aquarius";
        }

        else if (month == 2){
            if (day < 19)
                zodiacSign = "Aquarius";
            else
                zodiacSign = "Pisces";
        }

        else if(month == 3){
            if (day < 21)
                zodiacSign = "Pisces";
            else
                zodiacSign = "Aries";
        }
        else if (month == 4){
            if (day < 20)
                zodiacSign = "Aries";
            else
                zodiacSign = "Taurus";
        }

        else if (month == 5){
            if (day < 21)
                zodiacSign = "Taurus";
            else
                zodiacSign = "Temini";
        }

        else if( month == 6){
            if (day < 21)
                zodiacSign = "Gemini";
            else
                zodiacSign = "Cancer";
        }

        else if (month == 7){
            if (day < 23)
                zodiacSign = "Cancer";
            else
                zodiacSign = "Leo";
        }

        else if( month == 8){
            if (day < 23)
                zodiacSign = "Leo";
            else
                zodiacSign = "Virgo";
        }

        else if (month == 9){
            if (day < 23)
                zodiacSign = "Virgo";
            else
                zodiacSign = "Libra";
        }

        else if (month == 10){
            if (day < 23)
                zodiacSign = "Libra";
            else
                zodiacSign = "Scorpio";
        }

        else if (month == 11){
            if (day < 22)
                zodiacSign = "Scorpio";
            else
                zodiacSign = "Sagittarius";
        }

        System.out.println("Your zodiac sign is "+zodiacSign);

    }
}
