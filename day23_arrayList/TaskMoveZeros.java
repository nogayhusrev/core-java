package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMoveZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("---------------------");
        System.out.println(list);
        int temp=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==0) {
                temp = list.get(i);
                list.remove(i);
                list.add(temp);

            }
        }
        System.out.println("---------------------");
        System.out.println(list);

    }
}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */