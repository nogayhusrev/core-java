package day34_abstraction.deviceTask;

public class PersonalComputer extends Computer{


    public PersonalComputer(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " is turning off");
    }
}
/*
8. Create the following sub classes of Computer and add any extra methods that are needed:
			1. PersonalComputer:
			1. Desktop
			2. Laptop
 */