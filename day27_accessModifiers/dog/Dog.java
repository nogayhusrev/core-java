package day27_accessModifiers.dog;

public class Dog {

    public String name,breed, size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs , numberOfEyes, numberOfWings;
    public static boolean isFriendly;


    static {
        numberOfLegs = 2;
        numberOfEyes = 2;
        numberOfWings = 0;
        isFriendly = true;
    }

    public Dog(String name, String breed, String size, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("Dog" + name + " is eating");
    }

    public void drink(){
        System.out.println("Dog" + name + " is drinking");
    }

    public void sleep(){
        System.out.println("Dog" + name + " is sleepinh");
    }

    public void play(){
        System.out.println("Dog" + name + " is playing");
    }

    public void bark(){
        System.out.println("Dog" + name + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */