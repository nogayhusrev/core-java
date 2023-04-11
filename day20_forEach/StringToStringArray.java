package day20_forEach;

public class StringToStringArray {
    public static void main(String[] args) {

        String sentence = "I Love Java";
        System.out.println("Input : " + sentence);


        String[] arr = sentence.split(" ");
        String reverseWord = "";


        for (int i = arr[1].length() - 1; i >= 0;i-- ){
            reverseWord += arr[1].charAt(i);

        }

        sentence=arr[0] + " " + reverseWord + " " + arr[2];

        System.out.println("Output : " + sentence);




    }
}
/*
1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */