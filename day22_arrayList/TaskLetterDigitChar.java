package day22_arrayList;

public class TaskLetterDigitChar {
    /*
    5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods

     */

    public static void main(String[] args) {
        String input="Wooden Spoon!";
        String letters="";
        String specialChars="";
        String digits="";

        for (int i=0;i<input.length();i++){
            if (Character.isLetter(input.charAt(i))){
                letters+=input.charAt(i);
            }
            else if (Character.isDigit(input.charAt(i))){
                digits+=input.charAt(i);

            }
            else {
                specialChars+=input.charAt(i);

            }


        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }


}
