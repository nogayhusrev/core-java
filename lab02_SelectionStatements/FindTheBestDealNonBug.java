package lab02_SelectionStatements;

import java.util.Scanner;

public class FindTheBestDealNonBug {
    // loyalty program
    // Deal 1 if any customer buys more than 3 item each item's price will be decreased as %10
    // Deal 2 if any customer buys more than 3 item, there will be 5 $ dollar discount
    // Deal 3 if cart total is greater than 30 $ there will be discounted as % 15
    // deal can not be used as together.
    // Whichever deal the customer will earn more will be valid.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itemPrice = 9;

        int itemCount = 5;

        System.out.println("Please select the deal that you would like attend");
        int dealId = scanner.nextInt();

        //Bug-1 > Checking the deal ID
        if (!(dealId == 1 || dealId == 2 || dealId == 3)){
            System.out.println("You have entered wrong dealId. Please try again");
            return;
        }


        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();

        //Bug-2 - > Checking item count( >3)
        if (count < 3){
            System.out.println("to receive the deal you need to purchase at least 3 item");
            return;
        }

        //Bug-3 - > Checking stock amount
        if (itemCount < count){
            System.out.println("not sufficient stock:");
            return;
        }

        //Bug-4 - > Wrong variable usage - > count instead of itemCount
        int customerCartTotal = itemPrice * count;

        //Bug-5 - > Checking the cart total
        if (dealId == 3){
            if (customerCartTotal < 30){
                System.out.println("If the deal 3 is chosen, cart total needs to be greater than 30");
                return;
            }
        }

        int advicedDealId= 0;
        double amountWithSelectedDeal= 0;

        //Bug-5 - > Wrong deal1 calculation
        double amountWithDeal1 = customerCartTotal - ((double)customerCartTotal * 0.1);

        double amountWithDeal2 = customerCartTotal - 5 ;

        //Bug-6 - > Wrong deal3 calculation
        double amountWithDeal3 = customerCartTotal - ((double)customerCartTotal * 15)/100;


        if (dealId == 1){
            amountWithSelectedDeal = amountWithDeal1;
        }else if (dealId == 2){
            amountWithSelectedDeal = amountWithDeal2;
        }else{
            amountWithSelectedDeal = amountWithDeal3;
        }
        double amountWithAdvicedDeal;

        if ((amountWithDeal1 < amountWithDeal2)){
            if ((amountWithDeal1 < amountWithDeal3)){   ////Bug-7 - > Wrong if statement
                advicedDealId = 1;
                amountWithAdvicedDeal = amountWithDeal1;
            }else{
                advicedDealId= 3;    ////Bug-8 - > Wrong if statement
                amountWithAdvicedDeal = amountWithDeal3;  ////Bug-9 - > Wrong assigned value
            }
        }else if (amountWithDeal2< amountWithDeal3){
            advicedDealId = 2;
            amountWithAdvicedDeal = amountWithDeal2;  ////Bug-9 - > Wrong assigned value
        }else {  ////Bug-10 - > Missing else statement
            advicedDealId = 3;
            amountWithAdvicedDeal = amountWithDeal3;
        }

        if (dealId == advicedDealId){
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + count * itemPrice);
            System.out.println("Your cart with discount: " + amountWithAdvicedDeal); //// bug 11  print the wrong variable
        }else {
            System.out.println("There is an another deal option for you. dealId: " + advicedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advicedDealId + " price will be " + amountWithAdvicedDeal);
        }
    }
}
