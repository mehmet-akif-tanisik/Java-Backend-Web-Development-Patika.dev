package practices;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int validation = 3;
        int balance = 1000;

        FIRST_LOOP:
        while (validation > 0) {
            System.out.print("Your username :");
            String userName = keyboard.nextLine();

            System.out.print("Your password : ");
            String password = keyboard.nextLine();

            if (userName.equals("matnsk") && password.equals("123")) {
                System.out.println("Successfully logged in!");

                for (;;) {
                    System.out.println("""
                            1-Cash Deposit
                            2-Cash Withdrawal
                            3-Balance Inquiry
                            4-Exit""");
                    System.out.print("Please choose operation : ");

                    int select = keyboard.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Cash amount : ");
                            int price = keyboard.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Cash amount : ");
                            price = keyboard.nextInt();

                            if (price > balance)
                                System.out.println("Insufficient balance.");
                            else
                                balance -= price;
                            break;

                        case 3:
                            System.out.println("Balance : " + balance);
                            break;

                        case 4:
                            System.out.println("Thanks for choosing our bank.");
                            break FIRST_LOOP;
                    }
                }
            }
            else {
                --validation;
                System.out.println("Wrong username or password. Try again.");
                if (validation == 0) {
                    System.out.println("Your account has been blocked. Please contact customer services.");
                }
                else {
                    System.out.println("You can try : " + validation + " times.");
                }
            }
        }
    }
}
