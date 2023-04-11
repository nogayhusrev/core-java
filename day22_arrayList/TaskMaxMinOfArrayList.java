package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMaxMinOfArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = list.get(0) ;
        int min =list.get(0);

        for (int i : list) {
            if(min > i) min=i;
            if(max < i) max=i;
        }

        System.out.println("list = " + list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */