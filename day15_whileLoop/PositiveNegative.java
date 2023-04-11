package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num;
        int
                negatives=0,
                positives=0;

        System.out.println("Enter 5 times number:");
        System.out.println("Inputs:");


        for (int i=0;i<5;i++){
            num= scanner.nextInt();
            if (num>=0)
                positives++;
            else
                negatives++;

        }
        System.out.println(positives + " positive and " + negatives + " negative");



    }
}
/*
2. Create a class named PositiveNegative and write a program that asks
user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */