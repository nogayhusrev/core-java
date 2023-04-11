package day34_abstraction.deviceTask;

public class Iphone extends Phone implements AppleApps{
    public Iphone(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
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

    @Override
    public void downloadApp() {
        System.out.println(getClass().getSimpleName() + " is downloading app from " + appStoreName + " to " + OS);
    }


    public void faceTime(long phoneNum){
        System.out.println(getClass().getSimpleName() + " is face timing with " + phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getClass().getSimpleName() + " is face timing with " + email);
    }
}
/*
7. Create the following sub classes of Phone and add any extra methods that are needed:
			1. Iphone :
					extends Phone class and implements Downloadable & AppleApps interfaces
			2. Samsung:
					extends Phone class and implements Downloadable & AndroidApps interfaces
			4. Google:
					extends Phone class and implements Downloadable & AndroidApps interfaces
 */