package day31_inheritance.stateTask;

public class Texas extends State{
    public Texas(String name, String politicalParty, String governor, String senator, double population, double stateTax) {
        super(name, "TX", politicalParty, governor, senator, population, stateTax);
    }
}
