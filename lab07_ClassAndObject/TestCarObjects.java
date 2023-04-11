package lab07_ClassAndObject;


public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
       /*
        car1.brand = "BMW";
        car1.year = 2022;
        car1.model = "X6";
        car1.color = "Red";
        car1.price = 50000;

        */
        car1.setInfo("BMW", "X6", 2022, "Red", 50000);


        Car car2 = new Car();
        /*
        car2.brand = "Audi";
        car2.model = "Q4";
        car2.color = "Black";
        car2.year = 2021;
        car2.price= 45000;
        */
        car2.setInfo("Audi", "Q4", 2021, "Black", 45000);


        Car car3 = new Car();
        car3.setInfo("Lexus", "GS350", 2020, "White", 50000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


        car1.drive();

        System.out.println("-------------------------------------------------");

        Car car4 = new Car();
      //  car4 = null;
        car4 = new Car();

        car4.drive();



    }


}
