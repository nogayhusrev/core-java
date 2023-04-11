package day15_whileLoop;

import java.util.Scanner;

public class TysonProblem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a string:");
        String str = input.next();

        String result = "";

        for (int i = 0; i < str.length();i++) {

            result+=str.charAt(i);
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))  i++;

        }

        System.out.println("String : " +str);
        System.out.println("result = " + result);



    }
}

