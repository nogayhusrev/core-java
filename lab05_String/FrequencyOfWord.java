package lab05_String;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /*
        String sentence = "Java Java Java Java Python C# Ruby";

        int original_length = sentence.length();

        String temp = sentence; // "Java Java Java Java Python C# Ruby"

        temp = temp.replace("Java", "aaa"); // "aaa aaa aaa aaa Python C# Ruby"

        int new_length = temp.length();

        System.out.println(original_length);
        System.out.println(new_length);


        int totalNumberOfJava = original_length - new_length;

        System.out.println(totalNumberOfJava);

         */

        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        String temp = sentence.replace("Java", "abc");
        int totalNumberOfJava = sentence.length() - temp.length();

        System.out.println(totalNumberOfJava);





    }

}