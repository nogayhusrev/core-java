package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class Factoriel {

    public static void main(String[] args) {
        int input;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number to to calculate factoriel:");
        input= scanner.nextInt();

        fac(input);

    }

    public static void fac(int input){

        if(input < 0)
            return;

        long output=1;
        System.out.println("input = " + input);
        while(input > 0) {
            output *= input;
            input--;

        }
        System.out.println("output = " + output);
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */