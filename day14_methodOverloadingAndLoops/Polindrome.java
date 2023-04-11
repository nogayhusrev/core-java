package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class Polindrome {

    public static void main(String[] args) {

        String input;
        Scanner scanner=new Scanner(System.in);

        boolean isPolindrome=true;

        System.out.println("Enter the polindrome:");
        input= scanner.next();
        System.out.println("input:\n\t"+input);

        for (int i=0,j=input.length()-1;i<=j;i++,j--){

            if(input.charAt(i) != input.charAt(j)){
                isPolindrome=false;
                break;
            }

        }

        System.out.println("output:\n\t"+isPolindrome);



    }
}
/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */