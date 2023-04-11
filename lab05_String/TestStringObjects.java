package lab05_String;

public class TestStringObjects {

    public static void main(String[] args) {

        String str1 = new String("Java");


        String str2 = "Java";

        String str3 = new String("Java");

        String str4 = "Java";


        System.out.println(str1 == str2); // false

        System.out.println(str2 == str4); // true

        System.out.println(str1 == str3); // false


        System.out.println(str1.equals(str2));



    }

}
