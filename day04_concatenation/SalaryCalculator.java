package day04_concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate=50,
                weeklyHours=45;
        double stateTaxRate=6, //given as percentage
                federalTaxRate=26;//given as percentage
        int salaryBeforeTax=52*weeklyHours*hourlyRate;
        double stateTax= (double) (salaryBeforeTax*stateTaxRate/100);
        double federalTax= (double) (salaryBeforeTax*federalTaxRate/100);
        double totalTax=federalTax+stateTax;
        double salaryAfterTax=(double) salaryBeforeTax-stateTax-federalTax;

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }

}


/*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560


 */