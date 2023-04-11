package day09_scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {
        int shares;
        double value;
        String mostShareCompanyName;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number of the total shares:");

        if((shares=scanner.nextInt())>0){
            System.out.println();
            System.out.print("Enter your value:");
            value=scanner.nextDouble();
            System.out.println();

            System.out.print("Enter your favorite company:");
            mostShareCompanyName = scanner.next();
            System.out.println();



            System.out.println("Your total stock market holding is $"+(shares*value)+" which is made up to shares." +
                    mostShareCompanyName+" is your company holdins");

        }

    }
}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */