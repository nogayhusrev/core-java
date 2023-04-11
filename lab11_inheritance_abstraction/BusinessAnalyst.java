package lab11_inheritance_abstraction;

public final class BusinessAnalyst extends Employee implements ScrumMember, WFH{
    public BusinessAnalyst(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" gathering requirement documents");
    }

    public void analyze(){
        System.out.println(getName() +" is analyzing the requirements");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
