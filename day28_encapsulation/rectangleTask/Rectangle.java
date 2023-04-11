package day28_encapsulation.rectangleTask;

public class Rectangle {

    private double wide,length;

    public Rectangle(double wide,double length) {
        setSide(wide);
        setLength(length);
    }

    public double getWide() {
        return wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >0){
            this.length = length;
        }else{
            System.err.println("Invalid Argument");
            System.exit(0);
        }
    }

    public void setSide(double wide) {
        if (wide >0){
            this.wide = wide;
        }else{
            System.err.println("Invalid Argument");
            System.exit(0);
        }
    }

    public double calcArea(){
        return wide*length;
    }

    public double calcPerimeter(){
        return (2*wide)+(2*length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "wide=" + wide +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


}
/*
3. Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */
