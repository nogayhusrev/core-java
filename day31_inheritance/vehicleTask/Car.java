package day31_inheritance.vehicleTask;

import day29_inheritance.animalTask.Animal;

public class Car extends Vehicle {

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getBrand() +" "+getModel());
    }


}

/*
2. Create a sub class of Vehicle named Car

			Extra methods:
				drive()
 */