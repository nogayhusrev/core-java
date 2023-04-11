package day15_whileLoop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        double price=0;

        String
                name,
                gender,
                isMarried,
                fullCoverageOrLiabilityInsurance,
                anyAccident,
                hasAnAntiTheftDevice;


        int
                age,
                milesPerDay;

        Scanner scanner=new Scanner(System.in);


        System.out.println("Welcome to our insurance services:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Here is our offers:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Insurance Quote calculation:\n" +
                "\t\t\t\t\tStarting Prices for Liability:\n" +
                "\t\t\t\t\t\tage < 25 ===> 90\n" +
                "\t\t\t\t\t\tage >= 25 ==> 50\n" +
                "\n" +
                "\t\t\t\t\t\tmiles <= 10 ====> $10\n" +
                "\t\t\t\t\t    miles > 10 and miles <= 50 ==> $30\n" +
                "\t\t\t\t\t    miles > 50 ===>  $50\n" +
                "\n" +
                "\t\t\t\t\tStarting Prices For Full Coverage:\n" +
                "\t\t\t\t\t\tage < 25 ===> 160\n" +
                "\t\t\t\t\t\tage >= 25 ==> 120\n" +
                "\n" +
                "\t\t\t\t\t\tmiles <= 10 ====> $20\n" +
                "\t\t\t\t\t    miles > 10 and miles <= 50 ==> $40\n" +
                "\t\t\t\t\t    miles > 50 ===>  $70\n" +
                "\n" +
                "\n" +
                "\t\t\t\t    If the car has anti-theft device ==> 5% discount\n" +
                "\t\t\t\t    If he/she had any accidents or claims in past 5 years ===> 15% extra charge\n" +
                "\t\t\t\t    If he/she never had any accidents or claims in past 5 years ==> 10% discount\n" +
                "\t\t\t\t    If he/she is married ==> 5% discount\n" +
                " */");
        System.out.println("--------------------------------------------------------");


        //1. Ask the user to enter your name
        System.out.println("Please enter your name:");
        name=scanner.nextLine();
        while(name.isBlank()||name.isEmpty()){
            System.err.println("Don leave your name area blank!!!");
            System.out.println("Please enter your name:");
            name=scanner.nextLine();
        }

        //2. Ask the user to enter your gender
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("Please enter your gender(male/female):");
        gender= scanner.next();
        while(!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))){
            System.err.println("Please enter a valid entry:");
            System.out.println("Please enter your gender(male/female):");
            gender= scanner.next();

        }

        //3. Ask the user if he/she is married(Yes/No)
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("Are you married(yes/no)");
        isMarried= scanner.next();
        while(!(isMarried.equalsIgnoreCase("yes")||isMarried.equalsIgnoreCase("no"))){
            System.err.println("Please enter a valid entry:");
            System.out.println("Are you married(yes/no)");
            isMarried= scanner.next();
        }

        //4. Ask user to enter your age
        //(age can not be negative or greater than 120)
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("Please enter your age:");
        age=scanner.nextInt();
        while(!(age>0 && age<120)){
            System.err.println("Your age cannot be less than 0 and greater than 120!");
            System.out.println("Please enter your age:");
            age=scanner.nextInt();

        }

        //5. Ask user to enter how many miles he/she drives in a day
        //(mileage can not be negative or less than 5)
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("How many miles do you drive in a drive:");
        milesPerDay= scanner.nextInt();
        while (!(milesPerDay>5)){
            System.err.println("Miles in a day can not be under zero and not less than 5!");
            System.out.println("How many miles do you drive in a drive:");
            milesPerDay= scanner.nextInt();
        }

        //6. Ask the user if he/she wants full coverage or liability insurance?
        System.out.println("Which service do you want(Full Coverage/Liability Insurance) ");
        scanner.nextLine();
        fullCoverageOrLiabilityInsurance=scanner.nextLine();
        while (!(fullCoverageOrLiabilityInsurance.equalsIgnoreCase("Full Coverage")||
                fullCoverageOrLiabilityInsurance.equalsIgnoreCase("FullCoverage")||
                fullCoverageOrLiabilityInsurance.equalsIgnoreCase("Liability Insurance")||
                fullCoverageOrLiabilityInsurance.equalsIgnoreCase("LiabilityInsurance"))){
            System.err.println("Please enter a valid entry:");
            System.out.println("Which service do you want(Full Coverage/Liability Insurance) ");
            fullCoverageOrLiabilityInsurance=scanner.nextLine();
        }

        //7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("Do you have any accident in past five years?(yes/no)");
        anyAccident= scanner.next();
        while (!(anyAccident.equalsIgnoreCase("yes")||anyAccident.equals("no"))){
            System.err.println("Your answer cannot be other than yes/no !!!");
            System.out.println("Do you have any accident in past five years?(yes/no)");
            anyAccident= scanner.next();
        }

        //8. Ask the user if his/her car has an anti-theft device (Yes/No)
        //(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
        System.out.println("Do you have an anti-theft device(yes/no)?");
        hasAnAntiTheftDevice= scanner.next();
        while(!(hasAnAntiTheftDevice.equalsIgnoreCase("yes") || hasAnAntiTheftDevice.equalsIgnoreCase("no"))){
            System.err.println("Your answer cannot be other than yes/no !!!");
            System.out.println("Do you have an anti-theft device(yes/no)?");
            hasAnAntiTheftDevice= scanner.next();

        }


        System.out.println("Welcome to our insurance calculate service Mr/Ms " + name);
        System.out.println("--------------------------------------------------------");



        if(fullCoverageOrLiabilityInsurance.equalsIgnoreCase("FullCoverage")||
                fullCoverageOrLiabilityInsurance.equalsIgnoreCase("Full Coverage")){
            // age addition
            if( age < 25 ){price=160;}
            else{price=120;}

            // miles per day addition
            if (milesPerDay <= 10) price+=20;
            else if (milesPerDay>10 && milesPerDay<=50) price+=40;
            else price+=70;

        }else{
            // age addition
            if( age < 25 ){price=90;}
            else{price=50;}

            // miles per day addition
            if (milesPerDay <= 10) price+=10;
            else if (milesPerDay>10 && milesPerDay<=50) price+=30;
            else price+=50;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("You have chosen " + fullCoverageOrLiabilityInsurance + " and you are " + age + " years old.");
        System.out.println("So your base price is : $" + price);


        //extra discounts and charges

        //If the car has anti-theft device ==> 5% discount
        if (hasAnAntiTheftDevice.equalsIgnoreCase("yes")) {
            System.out.println("--------------------------------------------------------");
            System.out.println("You have an anti-theft device, so you have 5% discount and your discount is $" + price*0.05);
            price += -(price * 0.05);

        }

        //If he/she had any accidents or claims in past 5 years ===> 15% extra charge
        //If he/she never had any accidents or claims in past 5 years ==> 10% discount
        if(anyAccident.equalsIgnoreCase("yes")){
            System.out.println("--------------------------------------------------------");
            System.out.println("You have an accident in past 5 years, so you have 15% extra charge and your extra charge is $" + (price*0.15));
            price+=(price*0.15);
        }
        else{
            System.out.println("--------------------------------------------------------");
            System.out.println("You have no an accident in past 5 years, so you have 10% discount and your discount is $" + (price*0.1));
            price-=(price*0.1);

        }

        //If he/she is married ==> 5% discount
        if(isMarried.equalsIgnoreCase("yes")){
            System.out.println("--------------------------------------------------------");
            System.out.println("You are married, so you have 5% discount and your  discount is $" + (price*0.05));
            price-=(price*0.05);

        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Your total price:");
        System.out.println("$"+price);
        System.out.println("--------------------------------------------------------");


    }
}
/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based
on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */