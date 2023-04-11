package day08_ternarySwitch;

public class OxygenTank {
    public static void main(String[] args) {
        int level=67;

        String lvl=
                ((level>=90)?"Your tank is full":
                        ((level>=80)?"Still okay":
                                ((level>=70)?"Don't go too far":
                                        ((level>=60)?"Start to head back":
                                                ((level>=50)?"Be careful now you at 50%":"Danger!!!!")))));

        System.out.println(lvl);


    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary

 */