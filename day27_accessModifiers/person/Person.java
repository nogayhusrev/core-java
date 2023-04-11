package day27_accessModifiers.person;

public class Person {
    public String name;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfHead;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        planet = "Earth";
    }

    public void printPlanetName(){
        System.out.println("planet = " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
/*
4. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()

 */