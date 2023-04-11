package day04_concatenationSelfPracticing;

public class CarInfo {

    public static void main(String[] args) {

        int year=2020;
        String make="Audi";
        String model="A6";
        int miles=123_000;
        String color="Blue";
        float price= 34000.500F;

        System.out.print(year+" "+make+" "+model+" "+miles+" "+color+" $"+price);



    }
}
/*
1. CreateaclassnamedCarInfo.java 2. Declarethefollowingvariables:
    1. year
    2. make
    3. model
    4. miles
    5. color
    6. Price
3. Useconcatenationtoprintthefullinfoofthecarinthe
    following format:
    Year Make Model, Miles, Color, Price.
        Ex:
            Car information is :
                2018 Toyota Camry, 50000 miles, Red, $19000.
 */