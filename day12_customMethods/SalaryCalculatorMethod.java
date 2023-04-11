package day12_customMethods;

import java.util.Scanner;

public class SalaryCalculatorMethod {

    public static void main(String[] args) {

        double hourlyRate;
        int  weeklyHours;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        hourlyRate=scanner.nextDouble();
        System.out.println("Enter your weekly hours:");
        weeklyHours=scanner.nextInt();

        salary(hourlyRate,weeklyHours);

    }
    public static void salary(double hourlyRate, int weeklyHours){

        double grossIncome=hourlyRate*weeklyHours*52;

        System.out.println("You make $"+hourlyRate+" per hour");
        System.out.println("You work "+weeklyHours+" hours in a week");
        System.out.println("Your gross income is $"+grossIncome);

    }
}
/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */