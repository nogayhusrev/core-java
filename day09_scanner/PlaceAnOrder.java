package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        String productName;
        double price;
        int quantity;
        String firstName;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Give product name:");
        productName= scanner.nextLine();
        System.out.println();

        System.out.print("Enter price:");
        price= scanner.nextDouble();
        System.out.println();

        System.out.print("Enter quantity:");
        quantity= scanner.nextInt();
        System.out.println();

        System.out.print("Enter your first name:");
        firstName= scanner.next();
        System.out.println();


        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been places. your total is "+(price*quantity)+"$");

        scanner.close();

    }

}
/*

7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */