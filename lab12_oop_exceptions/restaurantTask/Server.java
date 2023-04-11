package lab12_oop_exceptions.restaurantTask;

public class Server extends Employee {

    public Server(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Server", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is serving the customers");
    }

    public void takeOrder(){
        System.out.println(getName()+" is taking customer orders");
    }

    public void cleanTable(){
        System.out.println(getName()+" is cleaning tables");
    }

    public Chef promoteToChef(){
        return new Chef(getName(), getAge(), getGender(), getId(),"Head Chef", getSalary());
    }

}

/*
5. Create a subclass of employee named Server

			extra methods:
				takeOrder()
				cleanTable()
 */
