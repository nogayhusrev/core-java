package day16_nestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int
                choice,
                daysOfStaying=0;

        int
                kingPrice=120,
                queenPrice=100,
                singlePrice=80,
                totalPrice=0;

        String cont;



        String
                kingBed="\tKing Bed ==> 120$",
                queenBed="\tQueen Bed ==> 100$",
                singleBed="\tSingle Bed ==> 80$";

        while(true){
            //The program asks the user which bedroom does he/she wants to reserve,how many nights he/she is staying.
            System.out.println("-----------------");
            System.out.println("Here are our offers:");
            System.out.println("\t\t(1)King Bed ==> 120$\n" +
                    "\t\t(2)Queen Bed ==> 100$\n" +
                    "\t\t(3)Single Bed ==> 80$\n" +
                    "\t\t(0)Exit");
            System.out.println("-----------------");
            System.out.println("Enter the number of you choice:");
            choice= scanner.nextInt();

            while(choice<0 || choice> 3){
                System.err.println("Invalid entry");
                System.out.println("-----------------");
                System.out.println("Enter the number of you choice:");
                choice= scanner.nextInt();
            }





            switch (choice){
                case 1:
                    //The program asks the user how many nights he/she is staying.
                    System.out.println("-----------------");
                    System.out.println("Enter the number of nights you want to stay:");
                    daysOfStaying= scanner.nextInt();

                    while(daysOfStaying<0 || daysOfStaying>365){
                        System.err.println("Invalid entry");
                        System.out.println("-----------------");
                        System.out.println("Enter the number of nights you want to stay:");
                        daysOfStaying= scanner.nextInt();
                    }
                    totalPrice=kingPrice*daysOfStaying;
                    System.out.println("You chose King Bed and your total price is " + totalPrice);
                    break;
                case 2:
                    //The program asks the user how many nights he/she is staying.
                    System.out.println("-----------------");
                    System.out.println("Enter the number of nights you want to stay:");
                    daysOfStaying= scanner.nextInt();

                    while(daysOfStaying<0 || daysOfStaying>365){
                        System.err.println("Invalid entry");
                        System.out.println("-----------------");
                        System.out.println("Enter the number of nights you want to stay:");
                        daysOfStaying= scanner.nextInt();
                    }
                    totalPrice=queenPrice*daysOfStaying;
                    System.out.println("You chose Queen  Bed and your total price is " + totalPrice);
                    break;
                case 3:
                    totalPrice=singlePrice*daysOfStaying;
                    System.out.println("You chose Single Bed and your total price is " + totalPrice);
                    break;
                case 0:
                    System.out.println("I am exiting. See you..");
                    System.exit(1);
                default:
                    break;



            }


            do{
                //  3. Ask the user "Would you like to calculate another Square?"
                //         If "yes" --> repeat the previous steps
                //         If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                //         If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                System.out.println("Would you like to calculate another Room Reservation?");
                cont= scanner.next();
                if(cont.equalsIgnoreCase("yes")){
                    break;
                }else if (cont.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Room Reservation Calculator APP");
                    System.exit(1);
                }else{
                    System.err.println("Invalid entry!!!");
                    System.out.println("------------");
                    continue;
                }


            }while (true);






        }

    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
