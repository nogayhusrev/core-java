package day11_stringMethods1;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        String input1,input2,output;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");
        input1= scanner.next();
        System.out.println("Enter a word:");
        input2= scanner.next();


        if (input1.endsWith((""+input2.charAt(0))))
            output=input1+input2.substring(1);
        else
            output=input1+input2;
        System.out.println("output = " + output);



    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
     print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight



 */