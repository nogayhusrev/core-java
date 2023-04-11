package day12_customMethods;

import java.util.Scanner;

public class DaysOfMonths {

    public static void main(String[] args) {
        String monthName;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the name og month:");
        monthName= scanner.next();

        monthDays(monthName);

    }

    public static void monthDays(String monthName){

        int num;

        monthName=monthName.trim().replace(" ","");
        monthName=monthName.substring(0,1).toUpperCase()+monthName.substring(1).toLowerCase();

        switch (monthName){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                num=31;
                break;
            case "February":
                num=28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                num=30;
                break;
            default:
                num=-1;
                System.err.println("Error");
                break;

        }

        System.out.println(monthName+ " has "+num+" days.");




    }

}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */