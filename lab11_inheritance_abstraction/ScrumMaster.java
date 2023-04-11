package lab11_inheritance_abstraction;

public final class ScrumMaster extends Employee implements ScrumMember, WFH{

    public ScrumMaster(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is scheduling meetings");
    }

    public void coaching(){
        System.out.println(getName()+" is coaching");
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
