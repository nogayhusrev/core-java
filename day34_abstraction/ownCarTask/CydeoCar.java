package day34_abstraction.ownCarTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void start() {
        System.out.println("use voice control to start "+getMake()+" "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }


    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" self drive mode is on");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" fly mode is on");
    }
}
