package day25_constructors;

public class TaskPizza {
    public String size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public TaskPizza(String size,int numberOfCheeseTopping,int numberOfPepperoniTopping){

        this.size=size;
        this.numberOfCheeseTopping=numberOfCheeseTopping;
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;

    }

    public double calcCost(){

        double price=0;

        price=((size.equalsIgnoreCase("small"))? 10 :
                (size.equalsIgnoreCase("medium")) ? 12 : 14);

        price+=(2*numberOfPepperoniTopping)+(2*numberOfCheeseTopping);

        return price;

    }

    @Override
    public String toString() {
        return "TaskPizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */