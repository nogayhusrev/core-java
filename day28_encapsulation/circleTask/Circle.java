package day28_encapsulation.circleTask;

public class Circle {

    private double radius;
    public double pi= Math.PI;


    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {

        if (radius > 0 ) {
            this.radius = radius;
        }else {
            System.err.println("Invalid argument");
            System.exit(0);
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter="+ calcPerimeter() +
                '}';
    }
}

/*
1. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed in the print statement

 */