package day06_ifStatements;

public class MinimumNumber {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        boolean isNum1Smaller=num1<num2;
        boolean isEqual=num1==num2;

        if(isNum1Smaller){
            System.out.println(num1+" is the minimum number.");

        } else if (isEqual) {
            System.out.println("Equal.");

        }
        else{
            System.out.println(num2+" is the minimum number.");
        }

    }
}
/*
1. Create a class named MinimumNumber.java
2. Declare the following variables: 1. num1
2. num2
3. Write a program that can print the minimum number between the two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
10 is the minimum number
 */