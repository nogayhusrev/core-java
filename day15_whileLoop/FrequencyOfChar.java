package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str;
        char ch;
        int freq=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a string");
        str= scan.nextLine();;
        System.out.println("Enter a char");
        ch=scan.next().charAt(0);

        for (int i=0;i<str.length()-1;i++){
            freq+=(str.charAt(i)==ch)?1:0;

        }


        System.out.println("Inputs:");
        System.out.println("str = " + str);
        System.out.println("ch = " + ch);
        System.out.println("Outputs:" + freq);

    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to
enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */