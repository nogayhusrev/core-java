package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number=132;

        boolean isPositive=number>0;
        boolean isNegative=number<0;
        boolean isZero=!isNegative&&!isNegative;

        System.out.println(number+" is "+(isPositive?"positive.":"negative."));



    }
}
