package day15_whileLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String
                input,
                result="";

        System.out.println("Enter a string:");
        input= scanner.nextLine();

        for (int i=0;i<input.length();i++){

            if(input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i)))
                result+=input.charAt(i);


        }

        System.out.println("Output: " + result);

    }
}
/*

9. Create a class called UniqueCharacters, Write a program that can return the unique
characters from a String

	           Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */