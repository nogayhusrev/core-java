package day29_inheritance.phoneTask;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private String color;
    private double price;

    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public void setBrand(String brand) {
        //1. brand can not be null/empty/blank

        if (!brand.isEmpty() && brand!=null) {
            this.brand = brand;
        }else{
            System.err.println("Brand of the phone can not be null or empty");
            System.exit(1);
        }
    }

    public void setModel(String model) {
        //	2. model can not be null/empty/blank
        if (!model.isEmpty() && model!=null) {
            this.model = model;
        }else{
            System.err.println("Model of the phone can not be null or empty");
            System.exit(1);
        }

    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        //3. Color can not be null/empty/blank
        if (!color.isEmpty() && color!=null) {
            this.color = color;
        }else{
            System.err.println("Color of the phone can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public void setPrice(double price) {
        //4. price can not be zero or negative
        if (price >0){
            this.price = price;
        }else{
            System.err.println("Price of the phone can not be zero or negative");
            System.exit(1);
        }
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

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting to " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                '}';
    }
}
/*
phoneTask
	1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

	2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

	3. Create a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement
 */