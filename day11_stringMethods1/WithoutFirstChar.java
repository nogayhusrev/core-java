package day11_stringMethods1;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        String input1,input2;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");
        input1= scanner.next();
        System.out.println("Enter a word:");
        input2= scanner.next();

        input1=input1.substring(1,input1.length());
        input2=input2.substring(1,input2.length());

        System.out.println("input1 = " + input1);
        System.out.println("input2 = " + input2);

    }
}
/*
5. Create a class named WithoutFirstChar.
Ask user to enter two words.
Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

 */