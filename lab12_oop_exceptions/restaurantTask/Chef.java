package lab12_oop_exceptions.restaurantTask;

public class Chef extends Employee{

    public Chef(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() +" is cooking");
    }

    public void makeOrder(){
        System.out.println(getName() +" is making the order");
    }

    public void washDishes(){
        System.out.println(getName() +" is washing the dishes");
    }


}

/*

	4. Create a subclass of employee named Chef

			extra methods:
				makeOrder()
				washDishes()
 */