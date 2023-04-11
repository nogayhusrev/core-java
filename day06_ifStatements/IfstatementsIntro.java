package day06_ifStatements;

public class IfstatementsIntro {

    public static void main(String[] args) {
        int number=-100;

        boolean isPositive=number>0;

        if(isPositive){
            System.out.println(number+" is positive");
        }else {
            System.out.println(number+" is negative");
        }


    }
}
