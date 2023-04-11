package day11_stringMethods1;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {
        String input;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");

        input= scanner.next();

        if (input.endsWith("ly"))
            System.out.println("really??");
        else
            System.out.println("never mind");
    }

}
/*
4. Create a class named ReallyNeverMind.
Ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"


 */