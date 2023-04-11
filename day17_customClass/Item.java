package day17_customClass;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name,double unitPrice,int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*
6. Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information of the item object



 */