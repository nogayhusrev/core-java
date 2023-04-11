package day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        /*
        System.out.println( iPhone.brand );
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem();
        */

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();



    }


}
