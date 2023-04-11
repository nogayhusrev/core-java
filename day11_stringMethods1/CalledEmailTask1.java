package day11_stringMethods1;

import java.util.Scanner;

public class CalledEmailTask1 {
    public static void main(String[] args) {

        String email,firstName,lastName;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your email:");
        email=scanner.next();


        firstName=email.substring(0,email.indexOf("_"));
        System.out.println(firstName);
        lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(lastName);

        email=email.replaceFirst(lastName,firstName);
        email=email.replaceFirst(firstName,lastName);


        System.out.println(email);



    }
}
/*
8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and
   last name.

    Write a program that can swap first name with last name in the email (Saperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com


 */