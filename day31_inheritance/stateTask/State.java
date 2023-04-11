package day31_inheritance.stateTask;

public class State {

    private String name, abbreviation, politicalParty, governor, senator;
    private double population,stateTax;



    public State(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {

        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public void setName(String name) {

        //1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
        if (name.isEmpty() || name==null ){
            System.err.println("Name cannot be empty, blank, or null");
            System.exit(1);
        }else {
            this.name=name;
        }
    }

    public void setAbbreviation(String abbreviation) {
        //1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
        if (abbreviation.isEmpty() || abbreviation==null ){
            System.err.println("Abbreviation cannot be empty, blank, or null");
            System.exit(1);
        }else {
            this.abbreviation=abbreviation;
        }
    }

    public void setPoliticalParty(String politicalParty) {
        //1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
        if (politicalParty.isEmpty() || politicalParty==null ){
            System.err.println("Political party cannot be empty, blank, or null");
            System.exit(1);
        }else {
            this.politicalParty=politicalParty;
        }
    }

    public void setGovernor(String governor) {
        //1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
        if (governor.isEmpty() || governor==null ){
            System.err.println("Governor cannot be empty, blank, or null");
            System.exit(1);
        }else {
            this.governor=governor;
        }
    }

    public void setSenator(String senator) {
        //1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
        if (senator.isEmpty() || senator==null ){
            System.err.println("Senator cannot be empty, blank, or null");
            System.exit(1);
        }else {
            this.senator = senator;
        }

    }

    public void setPopulation(double population) {
        // 4. Population can not be zero or negative

        if (population < 1){
            System.err.println("Population cannot be zero or negative");
            System.exit(1);
        }else {
            this.population = population;
        }
    }

    public void setStateTax(double stateTax) {
        // 3. taxRate can not be negative
        if (stateTax < 1){
            System.err.println("State tax cannot be zero or negative");
            System.exit(1);
        }else {
            this.stateTax = stateTax;
        }
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public double getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following sub classes of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub classes

                    test all the functions of each objects

                    Analyze the relationships between the classes

 */