package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class SumOfDigitsOfString {

    public static void main(String[] args) {

        String data;
        int sum=0;

        String letters="",digits="",specials="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the data:");
        data=scanner.nextLine();

        for(int i=0;i<data.length();i++)
            sum+=(Character.isDigit(data.charAt(i)))?Integer.parseInt(String.valueOf(data.charAt(i))):0;

        System.out.println("sum = " + sum);
    }


}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */