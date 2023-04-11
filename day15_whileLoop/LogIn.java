package day15_whileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        String
                username,
                password;

        Scanner scanner=new Scanner(System.in);

        boolean login=false;

        for (int i=0;i<3;i++){
            System.out.println("Enter your username:");
            username= scanner.next();
            System.out.println("Enter your password:");
            password=scanner.next();
            if (username.equals("Cydeo") &&  password.equals("Cydeo123") && i<3){
                login=true;
                break;

            }
            else
                login=false;

        }

       if (login)
           System.out.println("Logged in.");
       else
           System.out.println("Your account is lucked.");




    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application,
    assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                    If the credentials are not matched, the program should allow the user to
                        have three attempts to enter correct credentials and if all three attempts are failed,
                            then print "Your account is lucked."
 */