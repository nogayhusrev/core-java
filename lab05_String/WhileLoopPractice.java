package lab05_String;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to continue? yes/no");
        String a = input.nextLine().toLowerCase();

        while( !(a.equals("yes") || a.equals("no") ) ){
            System.err.println("Invalid entry! Would you like to continue? yes/no");
            a = input.nextLine().toLowerCase();
        }




    }

}
