package day22_arrayList;

public class TaskReplaceAll {


    /*
    2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement.
         The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays


     */

    public static int[] replaceAll(int [] arr, int oldElement,int newElement ){

        for (int i=0;i<arr.length;i++) {

            if(arr[i]==oldElement)
                arr[i]=newElement;

        }

        return arr;

    }

    public static double[] replaceAll(double[] arr, double oldElement,double newElement ){

        for (int i=0;i<arr.length;i++) {

            if(arr[i]==oldElement)
                arr[i]=newElement;

        }

        return arr;

    }

    public static char[] replaceAll(char [] arr, char oldElement, char newElement ){

        for (int i=0;i<arr.length;i++) {

            if(arr[i]==oldElement)
                arr[i]=newElement;

        }

        return arr;

    }

    public static String[] replaceAll(String [] arr, String oldElement, String newElement ){

        for (int i=0;i<arr.length;i++) {

            if(arr[i]==oldElement)
                arr[i]=newElement;

        }

        return arr;

    }


}
