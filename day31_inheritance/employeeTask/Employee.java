package day31_inheritance.employeeTask;

public class Employee {

    private String name, jobTitle, companyName;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, String jobTitle, String companyName, int age, double salary) {
       setName(name);
       setGender(gender);
       setJobTitle(jobTitle);
       setCompanyName(companyName);
       setAge(age);
       setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        //3. gender can only be set to 'M' or 'F'
        if (gender == 'M'){
            this.gender = gender;
        }else if (gender =='F'){
            this.gender = gender;
        }else{
            System.err.println("Gender cannot be other than (M,F)");
            System.exit(1);
        }


    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAge(int age) {
        //1. Age can not be zero or negative
        //2. Age can not be less than 18
        if (age < 18){
            System.err.println("Age should not be set to negative or zero or less than 18");
            System.exit(1);
        }

        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
employeeTask:
    1. Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()


    2. Create ethe following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"

            2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

            3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them

 */