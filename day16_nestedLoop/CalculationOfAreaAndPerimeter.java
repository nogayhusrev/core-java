package day16_nestedLoop;

import java.util.Scanner;

public class CalculationOfAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int radius;
        double
                diameter,
                area,
                perimeter;

        String cont;



        while (true) {
            System.out.println("Enter the radius:");
            radius = scanner.nextInt();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);

            } else {
                diameter = radius * 2;
                area = Math.PI * Math.pow((double) radius, 2);
                perimeter = 2 * Math.PI * radius;
                System.out.println("diameter = " + diameter);
                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);

            }

            do{
                //  3. Ask the user "Would you like to calculate another Square?"
                //         If "yes" --> repeat the previous steps
                //         If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                //         If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                System.out.println("Would you like to calculate another circle?");
                cont= scanner.next();
                if(cont.equalsIgnoreCase("yes")){
                    break;
                }else if (cont.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
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
4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after
                                displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */