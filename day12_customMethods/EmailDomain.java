package day12_customMethods;

import java.util.Scanner;

public class EmailDomain {

    public static void main(String[] args) {

        String email;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your email:");
        email=scanner.nextLine();

        emailDomain(email);



    }
    public static void emailDomain(String email){
        String domain;
        email=email.trim().replace(" ","");
        domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain = " + domain);

    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */