package day09_scanner;

import java.util.Scanner;

public class PeopleLive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please give your number of family members:");
        int num= scan.nextInt();
        if(num<3){
            System.out.println("Live with less than 3 people");
        } else if (num >= 3 && num <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (num > 6) {
            System.out.println("more than 6 people");
        }
        scan.close();
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */