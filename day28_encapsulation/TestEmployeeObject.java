package day28_encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee();
        // employee1.salary = -200000;

        employee1.setSalary(100000);

        System.out.println( employee1.getSalary());

       // employee1.setName("      ");

        System.out.println(employee1.getName());
        */

        Employee employee1 = new Employee("Daniel", 45, "Developer", 100000);

        System.out.println(employee1);



    }

}
