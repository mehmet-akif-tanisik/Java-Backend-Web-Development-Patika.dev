package practices;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String username, password;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        username = keyboard.nextLine();

        System.out.print("Please enter your password: ");
        password = keyboard.nextLine();

        if (username.equals("matnsk") && password.equals("1234")){
            System.out.println("You logged in.");
        } else {
            if (!username.equals("matnsk")){
                System.out.println("Wrong username.");
            }

            if (!password.equals("1234") && username.equals("matnsk")){
                System.out.println("Wrong password.");
                System.out.println("Do you want to change your password? ");
                String changeRequest = keyboard.nextLine();
                if (changeRequest.equals("yes")){
                    System.out.print("Please enter your new password: ");
                    String newPassword = keyboard.nextLine();
                    if (newPassword.equals(password) || newPassword.equals("1234")){
                        System.out.println("You could not change password. Please enter another password.");
                    } else {
                        System.out.println("You have changed your password.");
                    }
                }
            }

        }


    }
}
