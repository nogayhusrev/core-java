package day16_nestedLoop;

import java.util.Scanner;

public class CalculationOfRectangle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int
                length,
                width;

        double
                area,
                perimeter;

        String cont;



        while (true) {

            //1. Ask the user "Enter the length of the Rectangle:"
            //                                if user enters 0 or negative numbers,
            //                                terminate the program after displaying the error message
            //                                "Invalid Entry for the length of the rectangle"


            System.out.println("Enter the length:");
            length = scanner.nextInt();

            if (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(1);

            }

            // 2. Ask the user "Enter the width of the Rectangle:"
            //            if user enters 0 or negative numbers, terminate the program after displaying
            //               the error message "Invalid Entry for the width of the rectangle"

            System.out.println("Enter the width:");
            width = scanner.nextInt();

            if (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(1);
            }

            //3. Display:
            //           1. Area of rectangle
            //           2. Perimeter of rectangle

            area = width*length;
            perimeter = 2*width+2*length;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);


            do{
                //  4. Ask the user "Would you like to calculate another Square?"
                //         If "yes" --> repeat the previous steps
                //         If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                //         If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                System.out.println("Would you like to calculate another rectangle?");
                cont= scanner.next();
                if(cont.equalsIgnoreCase("yes")){
                    break;
                }else if (cont.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
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
6. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers,
                                terminate the program after displaying the error message
                                "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */