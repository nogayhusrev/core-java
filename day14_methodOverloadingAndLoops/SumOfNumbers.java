package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the input:");

        number= scanner.nextInt();
        sumOfNumbers(number);

    }

    public static void sumOfNumbers(int input){

        System.out.println("input = " + input);
        int sum=0;
        for (int i=1;i<input;i++)
            sum+=i;

        System.out.println("output = " + sum);






    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */