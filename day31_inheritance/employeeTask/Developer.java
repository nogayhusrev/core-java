package day31_inheritance.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, char gender, String jobTitle, String companyName, int age, double salary, String programmingLanguage) {
        super(name, gender, jobTitle, companyName, age, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return  super.toString().replace("}",", programmingLanguage='" + programmingLanguage + '\'' +
                '}');

    }
}
