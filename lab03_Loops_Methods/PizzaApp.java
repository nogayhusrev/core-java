package lab03_Loops_Methods;

import java.util.Scanner;


public class PizzaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");


        makeOrder(login());

    }

    public static void makeOrder(String email){

        for(int i=0;i<1;){

            System.out.println("Which pizza would you like to have. (Please type pizza name. To create your own pizza, please type special)");

            Scanner scanner = new Scanner(System.in);
            String pizzaChoice = scanner.next();


            if(checkPizzaThatWeHave(pizzaChoice)){  //valid pizza

                if(pizzaChoice.equals("special")){ //special pizza

                    //build your pizza

                     buildSpecialpizza();



                }else{

                    System.out.println("We have received your order. Price is $19.99");

                }
                System.out.println("Your order numnber is  " + generateOrderNumber(email));
                break;

            }else{
                System.out.println("You have entered invalid pizza name. Please try again");
            }

        }

    }

    private static void buildSpecialpizza() {

        Scanner scanner=new Scanner(System.in);
        boolean extraCorn=false;
        boolean extraOlives=false;
        boolean thinCrust=false;
        String answer;
        double totalPrice=0;
        System.out.println("Do you want extra corn for 2$ ? yes/no ");
        answer= scanner.next();
        if (answer.equalsIgnoreCase("yes"))
            extraCorn=true;

        System.out.println("Do you want thin crust for 1$ ? yes/no ");
        answer= scanner.next();
        if (answer.equalsIgnoreCase("yes"))
            thinCrust=true;

        System.out.println("Do you want extra olives for 3$ ? yes/no ");
        answer= scanner.next();
        if (answer.equalsIgnoreCase("yes"))
            extraOlives=true;


        if (extraCorn) totalPrice+=2;
        if (extraOlives) totalPrice+=3;
        if (thinCrust) totalPrice+=1;

        String orderExp=" We have received your special order. Your special pizza includes:";

        orderExp+=(extraCorn)?"\nExtra Corn":"";
        orderExp+=(extraOlives)?"\nExtra Olives":"";
        orderExp+=(thinCrust)?"\nThin Crust":"";

        orderExp+="\nPrice is $" + (totalPrice+19.99);

        System.out.println(orderExp);







    }

    public static String generateOrderNumber(String email) {  //order_m0i1k2e@gmail.com

        String orderNumber = "order_";

        for(int i = 0;email.length()>i+1;i++){

            orderNumber += email.substring(i,i+1);
            orderNumber += i;

        }

        return orderNumber;

    }

    public  static boolean checkPizzaThatWeHave(String pizzaChoice) {


        String pizza1 = "Margarita";
        String pizza2 = "Salami";
        String pizza3 = "Veggie";
        String pizza4 = "FourCheese";
        String pizzaSpecial = "Special";

        return pizzaChoice.equalsIgnoreCase(pizza1) ||
                        pizzaChoice.equalsIgnoreCase(pizza2) ||
                        pizzaChoice.equalsIgnoreCase(pizza3) ||
                        pizzaChoice.equalsIgnoreCase(pizza4) ||
                        pizzaChoice.equalsIgnoreCase(pizzaSpecial);
    }

    public static boolean isInputValid(int an) {

        boolean checkAccountNo = an >= 100 && an < 1000;
        return  checkAccountNo;
    }

    public static boolean isInputValid(String givenEmail) {

        //Check if the email address is valid:  //if @ . available, and @ is before . mikegmail.com
        int firstSignOfIndex = givenEmail.indexOf('@');  // -1
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0; //invalid

        if(checkEmail){
            return false;
        }

        return isEmailDomainValid(givenEmail);
    }

    public static boolean isEmailDomainValid(String givenEmail) {


        //Check if domain is valid  //gmail and hotmail domain - > mike@gmail.com
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));        //gmail
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkDomain;

    }

    public static String login(){

        //Create 3 variables named email(string),account number(int),password and assign values, DB values
        String email = "mike@gmail.com";
        int accountNumber = 123; //account number can be between >100 and <1000
        String password = "password";

        //Ask customer if he/she wants to log in with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {
            //create the selection flow for the login type
            switch (loginType) {

                case 1:  ///if I choose login type - 1, should do credential check

                    //Enter your email
                    System.out.println("Enter your email:");
                    String givenEmail = scanner.next();


                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid Email. Please try again...");
                        continue;
                    }


                    //Enter your password
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if log in successful
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else { //invalid checking

                        if (i != 1) {  //ask again

                            System.out.println("Invalid credentials !! left " + (i - 1) + " chances to try");

                            i--;  //i = i-1;
                            continue;  //do not execute anything after this point, go back to for loop
                            //break;   //stop the loop here, and exit the loop
                            //return   //stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(0); //close the execution of jvm

                        }

                    }


                case 2:
                    System.out.println("Please type your account number:");
                    int an = scanner.nextInt();

                    //invalid and try again
                    if (!isInputValid(an)) {
                        System.out.println("Invalid Account Number. Try again");
                        continue;
                    }

                    System.out.println("Please enter your password");
                    givenPassword = scanner.next();

                    //Check if log in successful
                    if (an == accountNumber && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with account number");
                        break;

                    } else { //invalid checking

                        if (i != 1) {  //ask again

                            System.out.println("Invalid credentials !! left " + (i - 1) + " chances to try");

                            i--;  //i = i-1;
                            continue;  //do not execute anything after this point, go back to for loop
                            //break;   //stop the loop here, and exit the loop
                            //return   //stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(0); //close the execution of jvm

                        }


                        break;  //stop the switch-case
                    }


            }

            break; //stop the for loop

        }

        return email;

    }








}
