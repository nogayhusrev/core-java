package lab02_SelectionStatements;

import java.util.Scanner;

public class FindTheBestDeal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int itemPrice = 9;

        int itemCount = 5;

        System.out.println("Please select the deal you would like use");
        int dealId = scanner.nextInt();

        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();

        int customerCartTotal = itemPrice * itemCount;

        int advicedDealId= 0;
        double amountWithSelectedDeal= 0;
        // deal1 calculations
        double amountWithDeal1 = customerCartTotal * 0.1;
        // deal2 calculations
        double amountWithDeal2 = customerCartTotal - 5 ;
        // deal3 calculations
        double amountWithDeal3 = (customerCartTotal * 100)/15;


        if (dealId == 1){
            amountWithSelectedDeal = amountWithDeal1;
        }else if (dealId == 2){
            amountWithSelectedDeal = amountWithDeal2;
        }else{
            amountWithSelectedDeal = amountWithDeal3;
        }
        double amountWithAdvicedDeal= 0;

        if ((amountWithDeal1 < amountWithDeal2)){
            if ((amountWithDeal2 < amountWithDeal3)){
                advicedDealId = 1;
                amountWithAdvicedDeal = amountWithDeal1;
            }else{
                advicedDealId= 1;
                amountWithAdvicedDeal = amountWithDeal2;
            }
        }else if (amountWithDeal2< amountWithDeal3){
            advicedDealId = 2;
            amountWithAdvicedDeal = amountWithDeal3;
        }

        if (dealId == advicedDealId){
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + count * itemPrice);
            System.out.println("Your cart with discount: " + customerCartTotal);
        }else {
            System.out.println("There is an another deal option for you. dealId: " + advicedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advicedDealId + " price will be " + amountWithAdvicedDeal);
        }

    }



}
