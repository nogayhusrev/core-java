package day19_array;

import java.util.Arrays;

public class ReverseOfArray {

    public static void main(String[] args) {

        int array[] = {1,2,3,4,5};
        int [] reverseArray=new int[array.length];

        for (int i=(array.length-1);i>=0;i--)
            reverseArray[(array.length-1-i)]=array[i];

        System.out.println("reverseArray = " + Arrays.toString(reverseArray));


    }
}
/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */