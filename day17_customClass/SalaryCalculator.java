package day17_customClass;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHour;

    public static void main(String[] args) {

        SalaryCalculator slcr=new SalaryCalculator();
        slcr.setInfo(12.23,34,12,45);
        System.out.println(slcr);

    }


    public void setInfo(double hourlyRate,double stateTaxRate,double federalTaxRate,int weeklyHour){
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate/100;
        this.federalTaxRate=federalTaxRate/100;
        this.weeklyHour=weeklyHour;

    }

    public double salary(){

        return ( hourlyRate * weeklyHour * 52);
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    @Override
    public String toString() {
        return "------------------------\n" +
                "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }
}
/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percenrage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): claculates the totalstateTax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */