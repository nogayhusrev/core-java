package day17_customClass;

public class Rectangle {
    double length=0;
    double width=0;

    public static void main(String[] args) {

        Rectangle rect=new Rectangle();
        rect.setInfo(234,23);
        System.out.println(rect);
    }


    public void setInfo(double length,double width){
        this.length=length;
        this.width=width;

    }

    public String toString(){
        return "------------------------\n" +
                "Rectangle{ " +
                "lenth = " + length +
                " width = " + width +
                " area = " + calculateArea() +
                " perimeter = " + calculatePerimeter() +
                " }";

    }

    private double calculatePerimeter() {

        return width*length;
    }

    private double calculateArea() {
        return 2*length+2*width;
    }




}
/*
3. create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should diplay the length, width, area and perimeter of the Rectangle object

 */