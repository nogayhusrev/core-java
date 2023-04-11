package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        String
                king="King Bed ==> 120$",
                queen="Queen Bed ==> 100$",
                single="Single Bed ==> 80$",
                wantToRoom="no",
                room;

        Scanner scanner=new Scanner(System.in);


        System.out.println("Do you want a room?(yes/no)");
        wantToRoom= scanner.next();


        while(!(wantToRoom.equalsIgnoreCase("yes")||wantToRoom.equalsIgnoreCase("no"))) {
            System.err.println("Please enter a valid answer!!!");
            System.out.println("Do you want a room?(yes/no)");
            wantToRoom = scanner.next();
        }

        if (wantToRoom.equalsIgnoreCase("yes")){
            System.out.println("Please enter which room you want:(king/queen/single)");
            room= scanner.next();

            while(!((room.equalsIgnoreCase("king") ||
                    room.equalsIgnoreCase("queen")||
                            room.equalsIgnoreCase("single")))) {
                System.err.println("Please enter a valid answer!!!");
                System.out.println("Please enter which room you want:(king/queen/single)");
                room = scanner.next();
            }

            if (room.equalsIgnoreCase("king"))
                System.out.println(king);
            else if (room.equalsIgnoreCase("queen"))
                System.out.println(queen);
            else
                System.out.println(single);

        }


        else {
            System.out.println("Have a nice day.");
        }


    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation,
   your program asks the user wants to reserve a room.
   if user entered yes, then ask which type of room the user wants to reserve.
   if user entered no, print "have a nice day"
   (if user entered any invalid answer (other than yes/no) ask user to reenter until
   user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

    the program should be able to display the room he/she reserved and total price of the room.

    (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */