package day31_inheritance.employeeTask;

public class Teacher extends Employee{


    public Teacher(String name, char gender, String jobTitle, String companyName, int age, double salary) {
        super(name, gender, jobTitle, companyName, age, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
