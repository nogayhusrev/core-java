package day12_customMethods;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        int age;
        boolean isAmerican;
        String isAme;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age:");
        age=scanner.nextInt();
        System.out.println("Enter is you American:(yes/no)");

        scanner.nextLine();
        isAmerican=(scanner.nextLine().trim().replace(" ","").toLowerCase().equals("yes"))?true:false;

        eligibleToVote(age,isAmerican);



    }

    public static void eligibleToVote(int age,boolean isAmerican){

        if (age >= 18 && isAmerican)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");


    }
}
/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */