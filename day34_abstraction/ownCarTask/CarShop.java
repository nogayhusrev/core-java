package day34_abstraction.ownCarTask;

public class CarShop {

    public static void main(String[] args) {


        Audi a = new Audi("Audi","A6",2022,"Matte Blue",90000);
        System.out.println(a);
        a.autoPark();
        a.drive();
        a.stop();



        Tesla t = new Tesla("Tesla", "Model S",2022,"Matte Blue",90000);
        System.out.println(t);
        t.selfDrive();
        t.autoPark();
        t.stop();
    }
}
