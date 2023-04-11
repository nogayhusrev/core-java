package day08_ternarySwitch;

public class Loans {
    public static void main(String[] args) {
        int salary=61_000;
        double creditScore=700;


        String loan=(salary>60000)?((creditScore>650)?"Loan Approved":"Loan Not Approved"):"Loan Not Approved";

        System.out.println(loan);
    }
}

/*
2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.


 */