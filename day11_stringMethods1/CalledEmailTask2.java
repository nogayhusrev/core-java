package day11_stringMethods1;

import java.util.Scanner;

public class CalledEmailTask2 {
    public static void main(String[] args) {
        String email,firstName,lastName,domain,temp;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your email:");
        email=scanner.next();



        firstName=email.substring(0,email.indexOf("_"));
        lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        domain=email.substring(email.indexOf("@")+1,email.indexOf("."));


        temp= String.valueOf(firstName.toUpperCase().charAt(0));
        firstName=firstName.toLowerCase();
        firstName=firstName.replaceFirst(String.valueOf(firstName.charAt(0)),temp);

        temp= String.valueOf(lastName.toUpperCase().charAt(0));
        lastName=lastName.toLowerCase();
        lastName=lastName.replaceFirst(String.valueOf(lastName.charAt(0)),temp);


        System.out.println("email = " + email);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);





    }
}
/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and
   followed by an underscore and last name.

   Write a program that will print out information about user based on email.
   Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first
   letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */