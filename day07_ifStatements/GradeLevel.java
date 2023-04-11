package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
        int level=7;

        if(level>=1&&level<=5)
            System.out.println("Elementary school");
            else if (level>=6&&level<=8)
                System.out.println("Middle school");
                else if (level>=9&&level<=12)
                    System.out.println("High school");
                    else if (level>=13&&level<=16)
                        System.out.println("College");
                        else if (level>=17&&level<=19)
                            System.out.println("Grad School");
                        else
            System.out.println("Unvalid argument");


    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
 */