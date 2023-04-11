package day27_accessModifiers.person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Adam",26,'M');

        p.eat("meat");
        p.drink("coke");


        System.out.println(p);
    }

}
