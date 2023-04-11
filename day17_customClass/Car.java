package day17_customClass;

import java.util.Scanner;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;


    public static void main(String[] args){

        Car tfs=new Car();

/*      tfs.make="TOFAŞ";
        tfs.model="ŞAHİN";
        tfs.year=2000;
        tfs.color="RED";
        tfs.price=95_000;
*/
        tfs.setInfo();
        System.out.println(tfs);
        tfs.start();


    }


    public void setInfo(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("------------------------");
        System.out.print("Type the make of the car:");
        make=scanner.next();


        System.out.println("------------------------");
        System.out.print("Type the model of the car:");
        model=scanner.next();


        System.out.println("------------------------");
        System.out.print("Type the year of the car:");
        year=scanner.nextInt();


        System.out.println("------------------------");
        System.out.print("Type the color of the car:");
        color=scanner.next();


        System.out.println("------------------------");
        System.out.print("Type the price of the car:");
        price=scanner.nextDouble();
        System.out.println();


        scanner.close();

    }

    public String toString(){

        String carInfo="";

        carInfo= "------------------------\n" +
                "Make\t: " + make + "\n" +
                        "Model\t: " + model + "\n" +
                        "Year\t: " + year + "\n" +
                        "Color\t: " + color + "\n" +
                        "Price\t: " + price + "\n" ;




        return carInfo;
    }

    public void start(){
        System.out.println("------------------------");
        System.out.println("Engine is starting...");
        System.out.println("------------------------");
    }



}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement,
			    it should display all the information of the car object
			start()
 */