package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int num=4;
        if(num==1||num==3||num==5||num==7||num==8||num==10||num==12){
            System.out.println("31 Days");
        } else if (num==4||num==6||num==9||num==11) {
            System.out.println("30 Days");
        } else if (num == 2) {
            System.out.println("28 Days");
        }else System.out.println("Invalid argument");


    }
}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a program that can print the number of days in the given month
Ex: Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */