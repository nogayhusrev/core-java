package day26_statics;

public class TaskCircle {

    public double radius=0;
    public double diameter=0;
    public static double PI=Math.PI;



    public TaskCircle(double radius){
        this.radius=radius;
        diameter=2*radius;

    }

    public double calcArea(){
        return Math.pow(radius,2)*PI;
    }

    public double calcPerimeter(){
        return 2*diameter;
    }

    public void printPi(){
        System.out.println("PI = " + PI);
    }

    @Override
    public String toString() {
        return "TaskCircle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */