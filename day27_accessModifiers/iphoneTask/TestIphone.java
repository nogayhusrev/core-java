package day27_accessModifiers.iphoneTask;


public class TestIphone {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iphone 12","5.6 inches","red",1000,"China");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);


    }
}
