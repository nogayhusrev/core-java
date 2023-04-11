package day08_ternarySwitch;

import static java.lang.String.*;

public class Calculator {

    public static void main(String[] args) {

        char op='+';
        int
                n1=56,
                n2=45;

        String output=
                ((op == '+') ? valueOf(n1 + n2) :
                        ((op == '*') ? valueOf(n1 * n2) :
                                ((op == '/') ? valueOf(n1 / n2) :
                                        ((op == '-') ? valueOf(n1 - n2) : "Invalid Info"))));

        System.out.println(output);
        System.out.println("-------------");

        int out=0;

        switch (op){
            case '+':out=n1+n2;break;
            case '*':out=n1*n2;break;
            case '/':out=n1/n2;break;
            case '-':out=n1-n2;break;
        }

        System.out.println(out);



    }
}
/*
7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement

 */