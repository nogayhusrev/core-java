package day34_abstraction.ownCarTask;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }
}
