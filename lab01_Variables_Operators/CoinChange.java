package lab01_Variables_Operators;

/*
1 quarter = 25 cents
1 dime = 10 cents
1 nickle = 5 cents
 */

public class CoinChange {

    public static void main(String[] args) {

        int priceInCents = 75;
        int change = 100 - priceInCents;  //40 - > 1 quarter 1 dime  = 25 + 10 = 35 cents

        int quarter = change / 25;  //  40 - > 1 quarter
        int dimes = (change%25)/10; //  15 - > 1 dime
        int nickles = ((change%25)%10)/5; // 5 -> 1 nickle

        System.out.println("quarter:" + quarter + " dimes:" + dimes + " nickles:" + nickles);






    }
}
