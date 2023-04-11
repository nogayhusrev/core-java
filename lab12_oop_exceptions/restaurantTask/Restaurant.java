package lab12_oop_exceptions.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String ownerName, location;
    private double numberOfStars;
    private final ArrayList<Server> servers;
    private final ArrayList<Chef> chefs;

    public Restaurant(String ownerName, String location, double numberOfStars) {
        setOwnerName(ownerName);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        if(numberOfStars < 0 || numberOfStars > 5){
            throw new IllegalArgumentException("Number of starts must be between 0 ~ 5: "+numberOfStars);
        }
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public ArrayList<Chef> getChefs() {
        return chefs;
    }


    public void hireServer(Server server){

        if(server == null){
           // return;
            throw new NullPointerException("Server object can not be null");
        }
        servers.add(server);
    }


    public void hireServer(Server[] servers){
        for (Server each : servers) {
            if(each == null){
                throw new NullPointerException("Server object can not be null");
            }
        }
        this.servers.addAll(Arrays.asList(servers));
    }


    public void hireChef(Chef chef){
        if(chef == null){
            throw new NullPointerException("Chef object can not be null");
        }
        chefs.add(chef);
    }


    public void hireChef(Chef[] chefs){
        for (Chef each : chefs) {
            if(each == null){
                throw new NullPointerException("Chef object can not be null");
            }
        }
      this.chefs.addAll(Arrays.asList(chefs));

    }


    public void terminateServer(String id){
        servers.removeIf( p -> p.getId().equalsIgnoreCase(id));
    }

    public void terminateChef(String id){
        chefs.removeIf( p -> p.getId().equalsIgnoreCase(id));
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "ownerName='" + ownerName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}

/*
6. Create a class named Restaurant

			variables:
				ownerName, location, numberOfStars
				servers (ArrayList<Server>, make it final)
				chefs (ArrayList<Chef>, make it final)

			Encapsulate all the fields

			Add a constructor that sets the ownerName, location and numberOfStarts to create restaurant object

			methods:
				hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

                terminateChef(String employeeID): removes the chef with the matching ID from the arraylist of chef

                terminateServer(String employeeID) removes the server with the matching ID from the arraylist of server

                toString(): Return (String) of all the information of a Restaurant object.
                 No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
 */