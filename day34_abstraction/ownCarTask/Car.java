package day34_abstraction.ownCarTask;

public abstract class Car {
    private final String make, model;
    private String color;
    private double  price;
    private final int year;

    public Car(String make, String model, int year, String color, double price) {
        //1. make, model, color can not be null
        //2. make, model, color can not be empty
        //2. year can not be less than 1886
        //2. price can not be negative
        if(make == null || make.isEmpty()){
            System.err.println("Make cannot be null or empty!");
            System.exit(1);
        }

        if(model == null || model.isEmpty()){
            System.err.println("Model cannot be null or empty!");
            System.exit(1);
        }

        if(year < 1886){
            System.err.println("Year cannot be less than 1986!");
            System.exit(1);
        }


        this.make = make;
        this.model = model;
        this.year = year;
        setColor(color);
        setPrice(price);


    }

    public void setColor(String color) {
        //2. make, model, color can not be empty
        if(color == null || color.isEmpty()){
            System.err.println("Color cannot be null or empty!");
            System.exit(1);
        }
        this.color = color;
    }

    public void setPrice(double price) {
        //2. price can not be negative
        if (price < 0){
            System.err.println("Price cannot be negative!");
            System.exit(1);
        }
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(getMake() + " " + getModel() + " is stopping.");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", year=" + year +
                '}';
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using extend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes
 */