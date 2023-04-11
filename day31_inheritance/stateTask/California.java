package day31_inheritance.stateTask;

public class California extends  State{

    public California(String name, String politicalParty, String governor, String senator, double population, double stateTax) {
        super(name, "CA", politicalParty, governor, senator, population, stateTax);
    }

}
