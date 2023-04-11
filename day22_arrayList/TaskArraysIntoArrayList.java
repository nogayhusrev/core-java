package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskArraysIntoArrayList {


    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};


        System.out.println("---------------------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(arr2));
        ArrayList<String> list=new ArrayList<>();

        for (String s : arr1) {
            list.add(s);
        }

        for (String s : arr2) {
            list.add(s);
        }


        System.out.println("---------------------------");
        System.out.println(list);

    }

}
/*
7. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */