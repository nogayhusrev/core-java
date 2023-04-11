package day11_stringMethods1;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {
        String input;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");

        input= scanner.next();

        input=(input.toLowerCase().startsWith("x"))?input.replaceFirst("x","a"):input;

        System.out.println(input);

    }

}
/*
2. Create a class named StartsWithX and write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */