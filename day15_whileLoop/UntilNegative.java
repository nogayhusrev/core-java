package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int sum=0;
        int temp;

        System.out.println("Enter a number:");

        while((temp=scanner.nextInt())>=0) {
            sum+=temp;
            System.out.println("Enter a number:");
        }

        System.out.println("sum = " + sum);



    }
}
/*
5. Create a class named UntilNegative and Write a program that
calculates the sum of numbers entered by the user until user enters a negative number.
 */