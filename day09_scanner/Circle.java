package day09_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        double radius;
        Scanner scan=new Scanner(System.in);
        double area, perimeter;


        System.out.print("Please give the radius value:");
        radius= scan.nextDouble();
        area=Math.PI*Math.pow(radius,2);
        perimeter=2*Math.PI*radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();
    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */