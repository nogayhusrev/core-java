package day28_encapsulation.itemTask;

public class Item {

    private String name;
    private int quantity;
    private double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public void setName(String name) {
        //name can not be empty or blank
        // name can not contain any special characters other than space
        // name must start with letters

        if(name.isEmpty() || name.isBlank() || name == null){
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        int special=0;

        for (char c: name.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c!=' '){
                special++;
                break;
            }
        }

        if (special>0){
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        if (!Character.isLetter(name.charAt(0))){
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public void setQuantity(int quantity) {
        /* quantity can not be negative
           if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
         */
        if (quantity < 0 || (name.equals("toilet paper") && quantity != 1)){
            System.err.println("Invalid Quantity: "+quantity);
            System.exit(1);
        }



        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        // unit price can not be negative

        if (unitPrice < 0){
            System.err.println("Invalid Unit Price: "+unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity= $" + quantity +
                ", total price= $" + quantity*unitPrice +
                '}';
    }

    public double calcCost() {
        return unitPrice*quantity;
    }

}
/*
3. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */