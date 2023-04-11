package day24_dateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskBornYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=0;
        System.out.println("Please enter your birth year: ");

        year= scanner.nextInt();

        System.out.println("You have born in a " + (isLeapYear(year)?"leap year.": "normal year."));

    }

    private static boolean isLeapYear(int year) {

        LocalDate date=LocalDate.of(year,1,1);

        return date.isLeapYear();

    }
}
/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false

 */