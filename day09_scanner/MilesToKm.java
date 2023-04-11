package day09_scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        int miles;
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Enter Miles:");
        miles= keyboard.nextInt();

        double km = (double) miles * 1.69;
        System.out.println(km);
        keyboard.close();

    }
}
/*
6. Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */