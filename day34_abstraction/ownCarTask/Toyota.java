package day34_abstraction.ownCarTask;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, String color, double price) {
        super(make, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");

    }
}
