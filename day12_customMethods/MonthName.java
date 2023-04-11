package day12_customMethods;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        int num;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the month number:");
        num= scanner.nextInt();
        monthName(num);

    }

    public static void monthName(int num){

        if (num==1){
            System.out.println("January");
        } else if (num == 2) {
            System.out.println("February");
        } else if (num == 3) {
            System.out.println("March");
        } else if (num == 4) {
            System.out.println("April");
        } else if (num == 5) {
            System.out.println("May");
        } else if (num == 6) {
            System.out.println("June");
        } else if (num == 7) {
            System.out.println("July");
        }else if (num == 8) {
            System.out.println("August");
        }else if (num == 9) {
            System.out.println("September");
        }else if (num == 10) {
            System.out.println("October");
        }else if (num == 11) {
            System.out.println("November");
        }else if (num == 12) {
            System.out.println("December");
        }else
            System.out.println("Invalid argument");

    }
}
/*
3. Create a method named monthName that can display the name of the month based
on the given number to the method, if the number is invalid,
then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */