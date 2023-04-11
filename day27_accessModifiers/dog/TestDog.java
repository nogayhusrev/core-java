package day27_accessModifiers.dog;

public class TestDog {

    public static void main(String[] args) {

        Dog d=new Dog("Duman","Kangal Kırma","Small",'M',1,"Brown");

        d.eat();
        d.drink();

        System.out.println(d);
    }
}
