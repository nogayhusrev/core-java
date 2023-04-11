package day23_arrayList;

import java.util.ArrayList;

public class TaskCombineTwoArrayList {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (String s : arr1) {
            list.add(s);
        }

        for (String s : arr2) {
            list.add(s);
        }

        System.out.println(list);

    }
}
/*
2. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};

                output:
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */