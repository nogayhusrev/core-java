package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};


        System.out.println(Arrays.toString(TaskSwap.swap(numbers,3,4)));

        boolean has25 = ArraysUtility.contains(numbers, 25);

        System.out.println("has25 = " + has25);

        System.out.println("--------------------------------------------");

        String[] students = {"Sumeye", "Hamza", "Marika"};

        System.out.println( ArraysUtility.contains(students, "Khashayar")  );



    }

}
