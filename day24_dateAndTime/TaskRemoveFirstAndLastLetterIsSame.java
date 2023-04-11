package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class TaskRemoveFirstAndLastLetterIsSame {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        System.out.println("-------------------------");
        System.out.println(list);

        list.removeIf(p->p.toUpperCase().charAt(0)==p.toUpperCase().charAt(p.length()-1));
        System.out.println("-------------------------");
        System.out.println(list);

    }
}
/*
7. Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */