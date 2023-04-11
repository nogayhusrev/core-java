package day11_stringMethods1;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        String input;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");

        input= scanner.next();

        input=input.replace("x","a");

        System.out.println(input);

    }
}
/*
3. Creat a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */