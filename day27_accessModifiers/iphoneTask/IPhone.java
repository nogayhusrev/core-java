package day27_accessModifiers.iphoneTask;

public class IPhone {
    public static String brand;
    public String model;
    public String size;
    public String color;
    public double price;
    public static String OS;
    public boolean isSmartPhone;
    public static String madeIn;
    public String designedIn;

    static{
        brand = "Apple";
        OS = "iOS";
        madeIn = "China";
    }

    public IPhone(String model, String size, String color, double price, String designedIn) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.designedIn = designedIn;
    }

    public void printOperatingSystem(){
        System.out.println("Operating system is " + OS);
    }

    public void call(long number){
        System.out.println(number + " is being called");
    }

    public void text(long number){
        System.out.println(number + " is being texted");
    }

    public void faceTime(long number){
        System.out.println(number + " is being called via facetime");
    }

    public void faceTime(String email){
        System.out.println(email + " is being called via facetime");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", isSmartPhone=" + isSmartPhone +
                ", designedIn='" + designedIn + '\'' +
                '}';
    }
}

/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */