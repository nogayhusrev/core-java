package day12_customMethods;

import java.util.Scanner;

public class DayName {

    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of the day:");
        num=scanner.nextInt();
        dayName(num);

    }

    public static void dayName(int num){
        if (num==1){
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else if (num == 7) {
            System.out.println("Sunday");
        }else
            System.out.println("Invalid argument");


    }
}
/*
4. Create a method named day that can display the name of the day based
on the given number to the method, if the number is invalid,
then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */