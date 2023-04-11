package day34_abstraction.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getClass().getSimpleName() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getClass().getSimpleName() + " is texting to " + phoneNum);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */