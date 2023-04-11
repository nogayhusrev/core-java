package lab06_Methods;

public class CustomMethodsPractice4 {


    public static void main(String[] args) {

        String str = "aaaabccdeeeef"; //"bdf"

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            /*
            char each = str.charAt(i);

            int f = StringUtility.frequency(str, each);

            if(f == 1){
                unique += each;
            }
            */

            if( StringUtility.frequency(str, str.charAt(i) ) ==1  ){
                unique += str.charAt(i);
            }

        }


        System.out.println(unique);


        System.out.println("--------------------------------------");


        String s = "aaabbc";   //"a3b2c1"

        String nonDup =  StringUtility.removeDup(s); // abc

        String result = "";

        for (int i = 0; i < nonDup.length(); i++) {

            /*
            char ch = nonDup.charAt(i);               // a b c
            int f = StringUtility.frequency(s, ch ); //  3 2 1
            result +=  ""+ch + f;
            */

            result += ""+nonDup.charAt(i) + StringUtility.frequency(s, nonDup.charAt(i)) ;

        }

        System.out.println(result);






    }


}
