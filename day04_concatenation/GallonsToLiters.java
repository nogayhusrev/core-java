package day04_concatenation;

import java.util.Scanner;

public class GallonsToLiters {

    public static void main(String[] args) {

        double gallons,liters;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give any number of Gallons:");
        gallons=sc.nextDouble();
        liters=gallons*3.79;
        System.out.println(gallons+" gallons equals to "+liters+" liters.");

    }

}

/*
4. Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L



 */