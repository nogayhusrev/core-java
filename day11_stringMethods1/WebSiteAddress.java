package day11_stringMethods1;

import java.util.Scanner;

public class WebSiteAddress {
    public static void main(String[] args) {

        String adddr;
        Boolean check=false;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Please enter the address:");
        adddr= scanner.nextLine();

        check=adddr.startsWith("www.");
        check=adddr.endsWith(".com") | adddr.endsWith(".edu") | adddr.endsWith(".gov");



        if (check)
            System.out.println("The address is valid.");
        else
            System.err.println("The address is invalid");

        scanner.close();

    }
}
/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov


 */