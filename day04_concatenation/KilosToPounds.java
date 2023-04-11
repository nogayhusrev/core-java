package day04_concatenation;

import java.util.Scanner;

public class KilosToPounds {

    public static void main(String[] args) {

        double kg,lb;
        Scanner sc=new Scanner(System.in);
        System.out.print("Give any number of Kilos:");
        kg=sc.nextDouble();
        lb=kg*2.2;
        System.out.println(kg+" kilos equals to "+lb+" pounds.");



    }
}

/*
3. Create a class named KilosToPounds and declare the following variables:
                kg
                lb

    3.1 Write a program that can convert the any given number of kilos to pounds
        Ex:
              kg = 10.5

        output:
              10.5 kilos is equal to 23.1 pounds

           Hint:  1kg = 2.2 lb
 */