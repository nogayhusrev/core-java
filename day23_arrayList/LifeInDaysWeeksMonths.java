package day23_arrayList;

import java.util.Scanner;

public class LifeInDaysWeeksMonths {

    public static void main(String[] args) {

        System.out.println("Welcome to Life İn Days Calculator");
        System.out.println("This program calculates how much time you have to live as days, weeks, months... ");

        Scanner scanner=new Scanner(System.in);
        int lifeExpectation;
        int currentAge;
        int yearsRemaining;
        int daysRemaining;
        int weeksRemaining;
        int monthsRemaining;


        System.out.println("-----------------------------");
        System.out.println("Please enter your life expectation as year : ");
        lifeExpectation= scanner.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Please enter your age : ");
        currentAge= scanner.nextInt();

        yearsRemaining=lifeExpectation-currentAge;
        daysRemaining=yearsRemaining*365;
        weeksRemaining=yearsRemaining*52;
        monthsRemaining=yearsRemaining*12;

        System.out.println("-----------------------------");

        System.out.println("You have " + daysRemaining + " days, " + weeksRemaining + " weeks, " + monthsRemaining + " months.");

    }


}
