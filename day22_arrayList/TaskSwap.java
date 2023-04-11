package day22_arrayList;

public class TaskSwap {
    /*
    4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
    the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
     */

    public static int[] swap(int [] arr, int i,int j ){

        if (i < 0 || i > arr.length-1 || j < 0 || j > arr.length-1  ){
            System.out.println("Given indexes is invalid");
            System.exit(0);

        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    public static double[] swap(double [] arr, int i,int j ){

        if (i < 0 || i > arr.length-1 || j < 0 || j > arr.length-1  ){
            System.out.println("Given indexes is invalid");
            System.exit(0);

        }

        double temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    public static char[] swap(char [] arr, int i,int j ){

        if (i < 0 || i > arr.length-1 || j < 0 || j > arr.length-1  ){
            System.out.println("Given indexes is invalid");
            System.exit(0);

        }

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

    public static String[] swap(String [] arr, int i,int j ){

        if (i < 0 || i > arr.length-1 || j < 0 || j > arr.length-1  ){
            System.out.println("Given indexes is invalid");
            System.exit(0);

        }

        String  temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        return arr;
    }

}
