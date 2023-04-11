package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class RetrieveFromStringLettersNumbersSpecials {


    public static void main(String[] args) {

        String data;
        String letters="",digits="",specials="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the data:");
        data=scanner.nextLine();

        for(int i=0;i<data.length();i++){

            letters=letters+((Character.isLetter(data.charAt(i)))?data.charAt(i):"");
            digits=digits+((Character.isDigit(data.charAt(i)))?data.charAt(i):"");
            specials += (Character.isLetter(data.charAt(i)) || (Character.isDigit(data.charAt(i)))) ? "" : data.charAt(i);


        }

        System.out.println("input = \n" + data);
        System.out.println("output = \n");
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);

    }
}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */