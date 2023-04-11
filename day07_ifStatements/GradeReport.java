package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score=45;
        String grade="";

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
    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a program that can print the grade of the student.
(only if the given score is a valid score, then print the name of the month. Otherwise print Invalid)
Ex:
score = 95
output:
Your grade is A
 */