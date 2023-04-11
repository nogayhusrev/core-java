package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate, weeklyHours;
        double stateTaxRate, //given as percentage
                federalTaxRate;//given as percentage
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter the hourly rate:");
        hourlyRate= scanner.nextInt();
        System.out.println("Enter weekly hour:");
        weeklyHours= scanner.nextInt();
        System.out.println("Enter State Tax:");
        stateTaxRate= scanner.nextDouble();
        System.out.println("Enter federal tax rate:");
        federalTaxRate=scanner.nextDouble();



        int salaryBeforeTax=52*weeklyHours*hourlyRate;
        double stateTax= (double) (salaryBeforeTax*stateTaxRate/100);
        double federalTax= (double) (salaryBeforeTax*federalTaxRate/100);
        double totalTax=federalTax+stateTax;
        double salaryAfterTax=(double) salaryBeforeTax-stateTax-federalTax;


        System.out.println("federalTax = " + federalTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }

}
/*
10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
