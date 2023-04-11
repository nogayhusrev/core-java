package day31_inheritance.employeeTask;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Adam", 'M',"Java Developer", "Cydeo", 26,400);
        System.out.println(e);

        System.out.println("------------------");
        Developer d = new Developer("Adam", 'M',"Java Developer", "Cydeo", 26,400,"Java");
        System.out.println(d);



    }
}
