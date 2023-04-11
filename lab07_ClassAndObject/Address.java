package lab07_ClassAndObject;

public class Address {

    public String buildingNumber, street, city, state, zipCode;

    // public static String country = "USA";


    public void setInfo(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return buildingNumber + " " + street + "\n" + city + ", " + state + " " + zipCode;

    }


}

/*
Create a custom class for Address objects.
In each object, user should be able to store the building number, street, city, state, and zip code information of the address
Add a function named setInfo that allows the user to be able to set all the fields of the address object
Add a function that allows the user to be able to display each objects’ shipping address when it’s passed in the print statement

 */