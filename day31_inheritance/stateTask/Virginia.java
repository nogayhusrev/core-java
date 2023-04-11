package day31_inheritance.stateTask;

public class Virginia extends State{

    public Virginia(String name, String politicalParty, String governor, String senator, double population, double stateTax) {
        super(name, "VA", politicalParty, governor, senator, population, stateTax);
    }
}
