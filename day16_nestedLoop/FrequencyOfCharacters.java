package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a string:");
        String str = input.next();

        String result = "";
        int j=0;

        for (int i = 0; i < str.length()-1;i++) {
            j=i-1;
            result+=str.charAt(i);
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))  i++;
            result=result+String.valueOf(i-j);

        }

        System.out.println("String : " +str);
        System.out.println("result = " + result);




    }
}
/*
9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */
