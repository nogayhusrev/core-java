package day09_scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        int age;
        String gender;
        String name;
        long phoneNumber;
        int zipCode;
        String schoolName;
        String cityName;
        String stateName;
        int buildingNumber;
        String streetName;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name:");
        name= scanner.nextLine();


        System.out.println("Enter your age:");
        age=scanner.nextInt();

        System.out.println("Enter your gender:");
        gender=scanner.next();
        scanner.nextLine();

        System.out.println("Enter your phone number:");
        phoneNumber=scanner.nextLong();

        System.out.println("Enter your street name:");
        streetName=scanner.nextLine();
        scanner.nextLine();


        System.out.println("Enter your building number:");
        buildingNumber= scanner.nextInt();

        System.out.println("Enter your city name:");
        cityName= scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter your state name:");
        stateName= scanner.nextLine();


        System.out.println("Enter your zipcode:");
        zipCode=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your school name:");
        schoolName= scanner.nextLine();



        System.out.println(name);
        System.out.println( age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.print("\t" + buildingNumber);
        System.out.println(" " + streetName);
        System.out.print("\t" + cityName);
        System.out.print(" " + stateName);
        System.out.println(" " + zipCode);
        System.out.println(schoolName);





    }

}
/*
11. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name





 */