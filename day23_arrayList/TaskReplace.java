package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskReplace {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        System.out.println("------------------------");
        System.out.println(list);
/*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Ahmed"))
                list.remove(i);
        }

 */
        list.removeIf(each -> each.equals("Ahmed"));

        System.out.println("------------------------");
        System.out.println(list);

    }
}
/*
3. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */