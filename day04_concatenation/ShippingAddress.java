package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name="Aron Kissinger",
                buildingNumber="13621A",
                streetName="Legacy Circle",
                city="Fairfax",
                zipcode="VA 22030";

        System.out.println("Your shipping address is: " +
                "\n\t\t\t\t\t\t"+name+" "+
                "\n\t\t\t\t\t\t"+buildingNumber+" "+streetName+"" +
                "\n\t\t\t\t\t\t"+city+" "+zipcode);




    }
}
/*
1. CreateaclassnamedShippingAddress.java
2. Declarethefollowingvariables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
3. Useconcatenationtoprintthefullshippingaddress
       Ex:
    Your Shipping address is:
A                             aron Kissinger 13621A Legacy Circle Fairfax, VA 22030
 */