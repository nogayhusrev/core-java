package lab06_Methods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        String str1 = helloName("James");

        System.out.println( helloName("James") );

        System.out.println("--------------------------------------");

        System.out.println( makeAbba("Hi", "Bye") );

        System.out.println("--------------------------------------");

        System.out.println( extraEnd("Hello") );

        System.out.println(extraEnd("a"));

        System.out.println(extraEnd("Hi"));

        System.out.println("--------------------------------------------");


        System.out.println(firstTwo("Hello"));

        System.out.println( firstTwo("x"));


        System.out.println("--------------------------------------------");

        System.out.println( withoutEnd("Hello"));

        System.out.println( withoutEnd("School") );


    }


/*
    public static void helloName(String name){
        String result = "Hello "+name+"!";
        System.out.println(result);
    }
 */

    public static String helloName(String name){
        String result = "Hello "+name+"!";
        return result;
    }


    public static String makeAbba(String a, String b){
        String result = a + b + b + a;
        return result;
    }


    public static String extraEnd(String str){

        if(str.length() < 2){
            return str;
        }

        // String substring = str.substring(str.length()-2); // last two characters of the given string
     //   String result = substring.repeat(3); // repeat the substring 3 times and return the concatenation

        return str.substring(str.length()-2).repeat(3);
    }


    public static String firstTwo(String str){
        /*
        if(str.length() < 2){
            return str;
        }

        return  ""+str.charAt(0) + str.charAt(1);
        */

        if(str.length() >= 2){
            return str.substring(0, 2);
        }else{
            return str;
        }

    }


    public static String withoutEnd(String str){

        if(str.length() >= 3){
            return str.substring(1, str.length()-1);
        }else{
            return str;
        }

    }



}
