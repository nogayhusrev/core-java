package lab06_Methods;

public class CustomMethodsPractice2 {

    public static void main(String[] args) {

        String result1 = comboString("Hello", "Cydeo");

        System.out.println(result1);

        System.out.println("---------------------------------------------------");

        System.out.println(left2("Java"));


        System.out.println("---------------------------------------------------");

        System.out.println( right2("Java") );

        System.out.println("---------------------------------------------------");

        System.out.println( frontAgain("edited")  );

        System.out.println("---------------------------------------------------");

        System.out.println( countHi("Hi Hi Hi Hi") );

        System.out.println("---------------------------------------------------");


    }



    public static String  comboString(String a, String b){

        if(a.length() > b.length()){
            return b + a + b;
        }else if(b.length() > a.length()){
            return a + b + a;
        }else{
            return a + b;
        }

    }


                                //"Hello"
    public static String left2(String str){

        if(str.length() < 3){
            return str;
        }

        String s1 = str.substring(0, 2);  //"He"
        String s2 = str.substring(2); // "llo"

        return s2 + s1;  // lloHe
    }


                                //"Hello"
    public static String right2(String str){
        if(str.length() < 3){
            return str;
        }

        String s1 = str.substring(str.length()-2 ); //"lo"
        String s2 = str.substring(0,str.length()-2 ); //"Hel"

        return s1 + s2; // "loHel"
    }



    public static boolean frontAgain(String str){

        if(str.length() < 2){
            return false;
        }

        String firstTwoChars = str.substring(0, 2);
        String lastTwoChars = str.substring(str.length()-2);

       // return str.endsWith(firstTwoChars);
        return  firstTwoChars.equals(lastTwoChars);
    }


    public static int countHi(String str){

        return StringUtility.frequency(str, "Hi");

    }


    public static boolean catDog(String str){
        str = str.toLowerCase();
       int countCat = StringUtility.frequency(str, "cat");
       int countDog = StringUtility.frequency(str, "dog");

       return countCat == countDog;
    }




}