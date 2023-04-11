package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=14,b=10,c=20;


        if((a > b) && (a > c)){
            if (b>c){
                System.out.println(b+" is the median number");
            }else{
                System.out.println(c+" is the median number");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println(a+" is the median number");
            }else{
                System.out.println(c+" is the median number");
            }

        } else if (c>a &&c>b) {
            if (a>b){
                System.out.println(a+" is the median number");
            }else{
                System.out.println(b+" is the median number");
            }

        }
        else System.out.println("Invalid Argument");

    }
}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */