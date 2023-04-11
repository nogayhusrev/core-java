package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {


        int dividend= 0;
        int divisor = 0;
        int quotient = 0;
        int division = 0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the dividend:");
        dividend=scanner.nextInt();
        System.out.println("Enter the divisor:");
        divisor= scanner.nextInt();

        for(int i = divisor; i<=dividend ; i+= divisor) {
            division++;
            quotient=dividend-i;
        }

        System.out.println("dividend = " + dividend);
        System.out.println("divisor = " + divisor);
        System.out.println("division = " + division);
        System.out.println("quotient = " + quotient);

    }
}
/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide two positive
numbers without using / (division) and * (multiplication) operators.
 */