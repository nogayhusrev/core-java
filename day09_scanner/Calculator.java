package day09_scanner;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Calculator {

    public static void main(String[] args) {

        char op;
        double n1,n2;
        double out=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number 1:");
        n1= scanner.nextDouble();;
        System.out.println();

        System.out.print("Enter operator:");
        op= scanner.next().charAt(0);
        System.out.println();

        System.out.print("Enter the number 2:");
        n2=scanner.nextDouble();
        System.out.println();


        String output=
                ((op == '+') ? valueOf(n1 + n2) :
                        ((op == '*') ? valueOf(n1 * n2) :
                                ((op == '/') ? valueOf(n1 / n2) :
                                        ((op == '-') ? valueOf(n1 - n2) : "Invalid Info"))));

        System.out.println(output);
        System.out.println("-------------");



        switch (op){
            case '+':out=n1+n2;break;
            case '*':out=n1*n2;break;
            case '/':out=n1/n2;break;
            case '-':out=n1-n2;break;
        }

        System.out.println(out);
        scanner.close();





    }
}
/*
9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"



 */