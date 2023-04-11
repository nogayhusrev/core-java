package lab05_String;

public class Reverse {

    public static void main(String[] args) {

        String word = "Wooden Spoon";

        String result = "";

        for (int i = word.length()-1; i >= 0; i--){ //i: index number of the string (word) starting from last index to 0
            char each = word.charAt(i); // character: starting from last character to first character
            result += each;
        }


        System.out.println(result);


    }


}
