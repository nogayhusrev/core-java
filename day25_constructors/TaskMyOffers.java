package day25_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMyOffers {
    public static void main(String[] args) {

        //2.1 Create 7 objects of Offer
        TaskOffer ofr1 = new TaskOffer("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);
        TaskOffer ofr2  = new TaskOffer("CA", "Sony Inc", "QA", 120000, true, false, false, true);
        TaskOffer ofr3  = new TaskOffer("FL", "Apple Inc", "QE", 125000, true, true, true, false);
        TaskOffer ofr4  = new TaskOffer("TX", "CapitalOne", "SM", 115000, false, false, true, true);
        TaskOffer ofr5  = new TaskOffer("WA", "Bank Of America", "BA", 130000, true, true, false, true);
        TaskOffer ofr6  = new TaskOffer("WA", "Bank Of America", "BA", 120000, true, true, false, true);
        TaskOffer ofr7  = new TaskOffer("WA", "Bank Of America", "BA", 125000, true, true, false, true);

        // 2.2 Create an array of Offers named myOffers and store all 7 objects of offers

        TaskOffer[] myOffers=new TaskOffer[7];
        myOffers[0]=ofr1;
        myOffers[1]=ofr2;
        myOffers[2]=ofr3;
        myOffers[3]=ofr4;
        myOffers[4]=ofr5;
        myOffers[5]=ofr6;
        myOffers[6]=ofr7;

        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(myOffers));


        // 2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        //                    2.3.1 Write a program that can remove the offer objects that are not full-time

        ArrayList<TaskOffer> fullTimeOffers=new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(myOffers));

        System.out.println("----------------------------------");
        System.out.println(fullTimeOffers);

        fullTimeOffers.removeIf(p->p.isFullTime==false);

        System.out.println("----------------------------------");
        System.out.println(fullTimeOffers);


        // 2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        //                    2.4.1 Write a program that can remove all the offers that are not from local

        ArrayList<TaskOffer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!( p.location.equals("VA") || p.location.equals("CA") ));

        System.out.println("----------------------------------");
        System.out.println(localOffers);


        //2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        //                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO

        ArrayList<TaskOffer> offersWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p->!(p.hasBenefit || p.hasPTO ));

        System.out.println("----------------------------------");
        System.out.println(offersWithBenefits);

        //2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
        //                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle
        ArrayList<TaskOffer> devOffers=new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p->!(p.jobTitle.equalsIgnoreCase("developer") ));

        System.out.println("----------------------------------");
        System.out.println(devOffers);

        //2.7 Create an ArrayList of Offer named offers with100K and add all the offer objects.
        //                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
        ArrayList<TaskOffer> with100K=new ArrayList<>(Arrays.asList(myOffers));
        with100K.removeIf(p->(p.salary<100_000 ));

        System.out.println("----------------------------------");
        System.out.println(with100K);



    }
}
/*
Task05:
    Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

    2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
*/