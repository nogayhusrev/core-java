package day09_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {


        int cents;

        Scanner scan=new Scanner(System.in);

        System.out.print("Please input your cents:");
        cents= scan.nextInt();


        System.out.println(cents+" equals to "+(cents/100)+" dollars and "+(cents%100)+" cents");


        scan.close();
    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */