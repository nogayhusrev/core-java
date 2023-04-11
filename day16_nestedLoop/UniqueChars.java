package day16_nestedLoop;

import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String
                input,
                result="";


        System.out.println("Enter a string:");
        input= scanner.next();

        for (int i=0;i<input.length();i++){
            int count=0;
            char chi=input.charAt(i);
            for (int j=0;j<input.length();j++){
                char chj=input.charAt(j);
                if(chi==chj){
                   count++;

                }
            }

            if (count!=1)
               continue;

            result+=chi;


        }

        System.out.println("Output: " + result);

    }
}
/*
10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

      Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique

 */