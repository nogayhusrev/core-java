package day15_whileLoop;

import java.util.Scanner;

public class Marriage {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String answer;

        System.out.println("Will you marry me ?");
        answer=scanner.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter");
            answer=scanner.next();
        }


        if(answer.equalsIgnoreCase("yes"))
            System.out.println("Congrats");
        else
            System.out.println("Goodbye");
    }

}
/*
1.  Create a class named Marriage proposal and
    Write a program for the  marriage proposal program asking the user,
    "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and
    repeat it until the user enters either yes or no

 */