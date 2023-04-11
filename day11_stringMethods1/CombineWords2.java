package day11_stringMethods1;

import java.util.Scanner;

public class CombineWords2 {

    public static void main(String[] args) {
        String input1,input2,output,temp;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word:");
        input1= scanner.nextLine();

        System.out.println("Enter a word:");
        input2= scanner.nextLine();

       /* temp= String.valueOf(input1.toUpperCase().charAt(0));
        input1=input1.toLowerCase().replaceFirst(String.valueOf(input1.charAt(0)),temp);

        temp= String.valueOf(input2.toUpperCase().charAt(0));
        input2=input2.toLowerCase().replaceFirst(String.valueOf(input2.charAt(0)),temp);
       */

        input1=input1.trim().replace(" ","");
        input2=input2.trim().replace(" ","");
        input1= input1.substring(0,1).toUpperCase()+input1.substring(1).toLowerCase();
        input2= input2.substring(0,1).toUpperCase()+input2.substring(1).toLowerCase();

        System.out.println(input1+" "+input2);

    }
}
/*
7. Write a program that asks user to enter first and last names,
nd then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */