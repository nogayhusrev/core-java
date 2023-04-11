package day17_customClass;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public static void main(String[] args) {

        Address adrss=new Address();

        adrss.setInfo(7925,"Jones Branch Dr","McLean Va","22012");
        System.out.println(adrss);

    }

    public void setInfo(int buildingNumber,String street,String state,String zipCode){
        this.buildingNumber=buildingNumber;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }

    @Override
    public String toString() {
        return "---------------------------------\n" +
                "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

/*
5. Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012

 */
