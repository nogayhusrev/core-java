package day12_customMethods;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {


        String first,last;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your firstname:");
        first= scanner.next();
        System.out.println("Enter your lastname:");
        last=scanner.next();

        capitalization(first,last);







    }

    public static void capitalization(String first, String last){


        first=first.trim().replace(" ","");
        last=last.trim().replace(" ","");

        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();

        System.out.println(first+" "+last);




    }
}
/*
2. Create a method named capitalization that can format the first and
last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */