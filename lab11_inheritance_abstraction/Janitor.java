package lab11_inheritance_abstraction;

public final class Janitor extends Employee{

    public Janitor(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Janitor", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() +" is cleaning the building");
    }


}
