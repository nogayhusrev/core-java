package lab01_Variables_Operators;

public class SwapNumbers {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

//        //Option-1 (by using 3rd variable)
//
//        int n3 = 0;
//        n3 = n1 ; // n1=10  n2=20  n3=10
//        n1 = n2 ; // n1=20  n2=20  n3=10
//        n2 = n3 ; // n1=20  n2=10  n3=10

        //Option-2 (by not using 3rd variable - with arithmetic operators)
        n2 = n1 + n2 ; // n1=10  n2=30
        n1 = n2 - n1 ; // n1=20  n2=30
        n2 = n2 - n1 ; // n1=20  n2=10





        System.out.println("n1:" + n1); //20
        System.out.println("n2:" + n2); //10
    }
}
