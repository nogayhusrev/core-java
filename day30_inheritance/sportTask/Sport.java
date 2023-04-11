package day30_inheritance.sportTask;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
       setName(name);
       setNumberOfPlayers(numberOfPlayers);
       setNumberOfReferee(numberOfReferee);
       setRules(rules);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        //1. numberOfPlayers can not be set to zero or negative
       if (numberOfPlayers>0){
           this.numberOfPlayers = numberOfPlayers;
       }else {
           System.err.println("Number of players cannot be negative or zero");
           System.exit(1);
       }
    }

    public void setNumberOfReferee(int numberOfReferee) {
        //						2. numberOfReferre can not be set to zero or negative
        if (numberOfReferee>0){
            this.numberOfReferee = numberOfReferee;
        }else {
            System.err.println("Number of referee cannot be negative or zero");
            System.exit(1);
        }
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void play(){
        System.out.println("Everyone is playing " + name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
/*
sportTask:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferre can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */