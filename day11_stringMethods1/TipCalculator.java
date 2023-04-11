package day11_stringMethods1;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        boolean split;
        int numberOfPeople;
        double amount,tip;
        String serviceQuality;

        Scanner scanner=new Scanner(System.in);


        System.out.println("Split or no split:");
        split=(scanner.next().equalsIgnoreCase("yes"))?true:false;
        System.out.println("Enter the number of people:");
        numberOfPeople= scanner.nextInt();
        System.out.println("Enter the check amount:");
        amount= scanner.nextDouble();
        System.out.println("Enter the service quality:(poor/fair/good/great/excellent)");
        scanner.nextLine();
        serviceQuality= scanner.next();

        tip=
                (serviceQuality.equalsIgnoreCase("poor")?amount*0.05:
                        ((serviceQuality.equalsIgnoreCase("fair")?amount*0.1:
                                ((serviceQuality.equalsIgnoreCase("good")?amount*0.15:
                                        ((serviceQuality.equalsIgnoreCase("great")?amount*0.2:
                                                amount*0.25)))))));

        if (split){
            System.out.println("Number of people: "+numberOfPeople);
            System.out.println("Total to pay:" +amount);
            System.out.println("Total tip:"+ tip);
            System.out.println("Total per person:"+amount/(double) numberOfPeople);
            System.out.println("Total tip for person:"+ tip/(double) numberOfPeople);
        }else{
            System.out.println("Number of people: "+numberOfPeople);
            System.out.println("Total to pay:" +amount);
            System.out.println("Total tip:"+ tip);
            System.out.println("Total per person:"+amount);
            System.out.println("Total tip for person:"+ tip);

        }


    }
}
/*
10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */