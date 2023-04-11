package day34_abstraction.deviceTask;

import javax.sound.midi.SysexMessage;

public abstract class Device {

    //Variables:
    //		brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton
    //Encapsulate all the fields
    //Add a constructor to set all the fields
    private final String brand, model, size;
    private String color;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {

        //1. brand, model color and size can not be null (if obj == null means it's error)
        //2. brand, model color and size can not be empty
        //3. price can not be set to negative or zero
        if (brand == null || brand.isEmpty()){
            System.err.println("Brand cannot be null or empty!");
            System.exit(1);
        }
        this.brand = brand;
        if (model == null || model.isEmpty()){
            System.err.println("Model cannot be null or empty!");
            System.exit(1);
        }
        this.model = model;
        if (size == null || size.isEmpty()){
            System.err.println("Size cannot be null or empty!");
            System.exit(1);
        }
        this.size = size;

        setColor(color);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void setColor(String color) {
        //1. brand, model color and size can not be null (if obj == null means it's error)
        //2. brand, model color and size can not be empty
        if (color == null || color.isEmpty()){
            System.err.println("Color cannot be null or empty!");
            System.exit(1);
        }
        this.color = color;
    }

    public void setPrice(double price) {
        //3. price can not be set to negative or zero
        if (price < 1){
            System.err.println("Price cannot be negative or zero!");
            System.exit(1);
        }
        this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    //Abstract Methods:
    //	turnOn(), turnOff()
    public abstract void turnOn();
    public abstract void turnOff();

    //None Abstract methods:
    //	toString(): displays brand, model, price

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$" + price +
                '}';
    }
}
/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price


	2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()


	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed

	4. Create an interface named downloadable:

				Abstract method:
					downloadApp();

	5. Create a child interface of Downloadable named AndroidApps:
			Variables:
				AppStoreName, OS

	6. Create a child interface of Downloadable named AppleApps

			Variables:
				AppStoreName, OS


	7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces


	8. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop


	9. Create a class named DeviceShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

 */