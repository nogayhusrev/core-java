package lab11_inheritance_abstraction;

public abstract class Employee extends Person { // meant to be inherited

    private final String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work(); // meant to be overridden

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", id=" + id +
                ", jobTitle=" + jobTitle +
                ", salary= $" + salary +
                '}';
    }




}

/*
2. Create the subclass of Person named Employee
			Extra variables:
				id, jobTitle, salary

			extra methods:
				work() (abstract)

			override the toString to include id, jobTitle, salary
 */