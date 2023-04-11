package day29_inheritance.carTask;

public class TestCar {
    public static void main(String[] args) {
        Car c=new Car();
        c.setInfo("Audi","A6","Matt Blue",2022,90000);
        System.out.println(c);

        System.out.println("-----------------------");
        Audi a=new Audi();
        a.setInfo("Audi","A6","Matt Blue",2022,90000);
        System.out.println(a);

        System.out.println("-----------------------");
        Volvo v=new Volvo();
        v.setInfo("Volvo","S60","Matt Blue",2022,90000);
        System.out.println(v);
    }
}
