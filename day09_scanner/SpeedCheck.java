package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        int speedLimit=55,currentSpeed;
        Scanner scan=new Scanner(System.in);

        System.out.print("Please give your speed:");
        currentSpeed= scan.nextInt();

        if (currentSpeed>speedLimit)
            System.out.println("You are driving "+(currentSpeed-speedLimit) +" mph over. Slow down! ");

        scan.close();
    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */