package day07_ifStatements;
public class WeekDays {
    public static void main(String[] args) {

        int num=4;

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
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a program that can print the name of the day that the number represents
Ex: Given:
number = 1
output: Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */