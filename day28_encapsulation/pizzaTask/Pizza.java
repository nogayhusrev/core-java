package day28_encapsulation.pizzaTask;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public void setSize(String size) {
        //size of the pizza can only be small, medium, large. case insensitive

        if (size==null){
            System.err.println("Size cannot be null ");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }else {
            System.err.println("Invalid Size: "+size);
            System.exit(1);
        }



    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        //  Number of cheese topping can not be negative, the maximum number of cheese topping is:
        //                                        small: 3
        //                                        medium: 4
        //                                        large: 5

        if (numberOfCheeseTopping < 0 || (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) || (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) || (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5)){
            System.err.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        //Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
        //
        //                                        small: 4
        //                                        medium: 5
        //                                        large: 6

        if (numberOfPepperoniTopping < 0 || (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 3) || (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 4) || (size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 5)){
            System.err.println("Invalid number of cheese topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public double calcCost() {
        //Pizza cost is determined by:
        //                        S: $10 + $2 per topping
        //                        M: $12 + $2 per topping
        //                        L: $14 + $2 per topping

        double price=0;
        price += (size.equalsIgnoreCase("small")? 10 : (size.equalsIgnoreCase("medium") ? 12: 14 ));
        price += (2*numberOfCheeseTopping) + (2*numberOfPepperoniTopping);

        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}
/*
4. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */