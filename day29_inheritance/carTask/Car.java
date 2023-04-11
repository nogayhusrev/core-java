package day29_inheritance.carTask;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public void setInfo(String make, String model, String color, int year, double price) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);

    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        if(year <= 0){
            System.err.println("Invalid year: "+year);
            System.exit(1);
        }
        this.year = year;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price: "+price);
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

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }

}
/*
carTask:
	1. Create a class named Toyota
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Toyota" and rest of the fields will be set based on the given arguments
					toString(): prints Toyota object info when the object is passed in the print statement

	2. Create a class named Honda
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Honda" and rest of the fields will be set based on the given arguments
					toString(): prints toyota object info when the object is passed in the print statement


	3. Create a class named BMW
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "BMW" and rest of the fields will be set based on the given arguments
					toString(): prints bmw object info when the object is passed in the print statement

	4. Create a class named Mercedes
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Mercedes" and rest of the fields will be set based on the given arguments
					toString(): prints mercedes object info when the object is passed in the print statement


	5. Create a class named Audi
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Audi" and rest of the fields will be set based on the given arguments
					toString(): prints audi object info when the object is passed in the print statement

	5. Create a class named Volvo
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Volvo" and rest of the fields will be set based on the given arguments
					toString(): prints volvo object info when the object is passed in the print statement


 */