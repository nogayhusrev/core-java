package lab07_ClassAndObject;

public class TestAddressObjects {

    public static void main(String[] args) {

        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();

        address1.setInfo("1234A", "Federalist Way", "Fairfax", "VA", "22031");
        address2.setInfo("78945B", "Potomac Crossing Way", "Sterling", "KY", "40769B");
        address3.setInfo("7925", "Jones Branch Dr", "McLean", "VA", "20132A");


        System.out.println(address1);
        System.out.println("-------------------------------------");
        System.out.println(address2);
        System.out.println("-------------------------------------");
        System.out.println(address3);


        System.out.println("-------------------------------------");

       // new Address();






    }


}
