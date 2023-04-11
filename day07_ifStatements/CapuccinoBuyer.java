package day07_ifStatements;

public class CapuccinoBuyer {
    public static void main(String[] args) {

        String size="tall";
        double tallPrice=3.69;
        int tallCalorie=90;

        double grandePrice=3.99;
        int grandeCalorie=120;

        double ventiPrice=4.29;
        int ventiCalorie=150;


        if(size.toLowerCase().equals("tall")||size.toLowerCase().equals("grande")||size.toLowerCase().equals("venti")){
            if(size.toLowerCase().equals("tall")){
                System.out.println("Price is $"+tallPrice);
                System.out.println(tallCalorie+" calories");
            } else if (size.toLowerCase().equals("grande")) {
                System.out.println("Price is $"+grandePrice);
                System.out.println(grandeCalorie+" calories");
            }else{
                System.out.println("Price is $"+ventiPrice);
                System.out.println(ventiCalorie+" calories");
            }
        }else{
            System.out.println("Invalid Size");
        }

    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if

 */