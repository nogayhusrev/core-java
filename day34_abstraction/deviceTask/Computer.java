package day34_abstraction.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    public void boot(){
        System.out.println(getClass().getSimpleName() + " is booting.");
    }
}
/*
3. Create a child abstract class of Device named Computer:
				Add any extra methods if needed
 */