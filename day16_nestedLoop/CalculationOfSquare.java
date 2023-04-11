package day16_nestedLoop;

import java.util.Scanner;

public class CalculationOfSquare {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int side;

        double
                area,
                perimeter;

        String cont;



        while (true) {

            // 1. Ask the user "Enter the side of the square:"
            //      if user enters 0 or negative numbers, terminate the program after
            //      displaying the error message "Invalid Entry for the side of the square"
            System.out.println("Enter the side:");
            side = scanner.nextInt();

            if (side <= 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);

            } else {

                //  2. Display:
                //      1. Area of square
                //      2. Perimeter of square

                area = Math.pow(side,2);
                perimeter = 4*side;

                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);

            }

            do{
                //  3. Ask the user "Would you like to calculate another Square?"
                //         If "yes" --> repeat the previous steps
                //         If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                //         If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                System.out.println("Would you like to calculate another square?");
                cont= scanner.next();
                if(cont.equalsIgnoreCase("yes")){
                    break;
                }else if (cont.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    System.exit(1);
                }else{
                    System.err.println("Invalid entry!!!");
                    System.out.println("------------");
                    continue;
                }


            }while (true);





        }




    }
}
/*
5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after
                                 displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */