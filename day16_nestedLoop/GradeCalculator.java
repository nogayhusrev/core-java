package day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int score;

        String cont;

        while (true){

            //1. Ask the user "Enter your score"
            //         If user enters invalid score, terminate the program after
            //          displaying the error message "Invalid Entry"

            System.out.println("Enter your score:");
            score=scanner.nextInt();

            if(score<=0 || score>100 ){
                System.err.println("Invalid entry!!!!");
                System.exit(1);
            }


            //2. Display the grade of the student.
            //        90 ~ 100 ==> A
            //        80 ~ 89 ==> B
            //        70 ~ 79 ==> C
            //        60 ~ 69 ==> D
            //        0 ~ 59 ==> F

            if (score>=90){
                System.out.println("Your grade is 'A' ");
            } else if (score>=80 && score <90) {
                System.out.println("Your grade is 'B' ");
            }else if (score>=70 && score <80) {
                System.out.println("Your grade is 'C' ");
            }else if (score>=60 && score <70) {
                System.out.println("Your grade is 'D' ");
            }else if (score>=0 && score <60) {
                System.out.println("Your grade is 'F' ");
            }

            do{
                //  3. Ask the user "Would you like to calculate another Square?"
                //         If "yes" --> repeat the previous steps
                //         If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
                //         If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                System.out.println("Would you like to calculate another score?");
                cont= scanner.next();
                if(cont.equalsIgnoreCase("yes")){
                    break;
                }else if (cont.equalsIgnoreCase("no")){
                    System.out.println("Thank you for using Cydeo Grade Calculator APP");
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
7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after
                                displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        3. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program

 */
