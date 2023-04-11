package day19_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int [] array = {10, 0, 5, 0, 1, 0};
        int temp;
        int j=array.length-1;

        for (int i=0;i<array.length;i++){

            if(array[i]==0){
                while(array[j]==0 && j>i) j--;
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
            //System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */