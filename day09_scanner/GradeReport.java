package day09_scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        double score;
        String grade="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please give your score:");
        score=scanner.nextDouble();


        if (score>=0 && score<=100){
            if(score>=90){
                grade="A";
            } else if (score>=80) {
                grade="B";
            }else if (score>=70) {
                grade="C";
            }else if (score>=60) {
                grade="D";
            }else
                grade="F";
            System.out.println("Your grade is "+ grade);
        }else
            System.err.println("You gave invalid data.");

        scanner.close();
    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */