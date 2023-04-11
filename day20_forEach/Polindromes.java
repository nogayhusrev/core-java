package day20_forEach;

public class Polindromes {

    public static void main(String[] args) {


        String [] arr={"anna", "level", "Java"};
        int k=0;

        for (String input:arr) {
            boolean isPolindrome=true;
            for (int i=0,j=input.length()-1;i<=j;i++,j--){

                if(input.charAt(i) != input.charAt(j)){
                    isPolindrome=false;
                    break;
                }

            }
            if (isPolindrome) {
                k++;
                System.out.println("input = " + input);
            }

        }
        System.out.println("Output :" + k);



    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */