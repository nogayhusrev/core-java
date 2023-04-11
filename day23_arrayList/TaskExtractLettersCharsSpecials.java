package day23_arrayList;

import java.util.ArrayList;

public class TaskExtractLettersCharsSpecials {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] ch =str.toCharArray();

        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specials=new ArrayList<>();


        for (char c : ch) {
            if(Character.isLetter(c)) letters.add(c);
            else if (Character.isDigit(c)) digits.add(c);
            else specials.add(c);

        }

        System.out.println("------------------------");
        System.out.println("letters = " + letters);
        System.out.println("------------------------");
        System.out.println("digits = " + digits);
        System.out.println("------------------------");
        System.out.println("specials = " + specials);

    }
}
/*
8. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */