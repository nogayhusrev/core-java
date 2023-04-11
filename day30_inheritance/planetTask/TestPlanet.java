package day30_inheritance.planetTask;

public class TestPlanet {

    public static void main(String[] args) {

        System.out.println("-------------------------");
        Planet p=new Planet("Earth",1200,20000,9,233543,213,421431);
        System.out.println(p);

        System.out.println("-------------------------");
        Earth e=new Earth("Earth",1200,20000,9,233543,213,421431);
        System.out.println(e);

        System.out.println("-------------------------");
        Venus v=new Venus("Earth",1200,20000,9,233543,213,421431);
        System.out.println(v);
    }
}
