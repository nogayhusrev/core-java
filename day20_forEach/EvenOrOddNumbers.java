package day20_forEach;

public class EvenOrOddNumbers {
    public static void main(String[] args) {

        int [] arr ={1,2,3,5,6,7,4,34,34,232,32,547,52,11,235,73423,121,35,234214};

        for (int num:arr ) {
            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }


}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */