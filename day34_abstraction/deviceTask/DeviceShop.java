package day34_abstraction.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {
        Desktop d = new Desktop("Asus","VivoBook","13.3","Black",1299,true,true);
        System.out.println(d);
        d.turnOff();
        d.turnOn();
        d.boot();

        System.out.println("-------------------------------------");

        Iphone i = new Iphone("Apple","İphone","5.7","Black",1299,true,true);
        System.out.println(i);
        i.turnOff();
        i.turnOn();

        System.out.println("-------------------------------------");

        Laptop l = new Laptop("Apple","MacBook Air","13.3","Silver",1299,true,true);
        System.out.println(l);
        l.turnOff();
        l.turnOn();

    }
}
/*
9. Create a class named DeviceShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

 */