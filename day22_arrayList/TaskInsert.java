package day22_arrayList;

import java.util.Arrays;

public class TaskInsert {

    /*
    3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
        the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
     */

    public static int[] insert(int [] arr, int index,int newElement ){

        if (index < 0 || index > arr.length-1){
            System.out.println("Given index is invalid");
            System.exit(0);

        }

        int[] result= Arrays.copyOf(arr,arr.length);
        result[index]=newElement;

        return result;

    }

    public static double[] insert(double [] arr, int index,double newElement ){

        if (index < 0 || index > arr.length-1){
            System.out.println("Given index is invalid");
            System.exit(0);

        }

        double[] result= Arrays.copyOf(arr,arr.length);
        result[index]=newElement;

        return result;

    }

    public static char[] insert(char [] arr, int index,char newElement ){

        if (index < 0 || index > arr.length-1){
            System.out.println("Given index is invalid");
            System.exit(0);

        }

        char[] result= Arrays.copyOf(arr,arr.length);
        result[index]=newElement;

        return result;

    }

    public static String[] insert(String [] arr, int index,String newElement ){

        if (index < 0 || index > arr.length-1){
            System.out.println("Given index is invalid");
            System.exit(0);

        }

        String[] result= Arrays.copyOf(arr,arr.length);
        result[index]=newElement;

        return result;

    }


}
