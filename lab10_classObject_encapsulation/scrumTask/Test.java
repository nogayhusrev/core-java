package lab10_classObject_encapsulation.scrumTask;

public class Test {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Daniel", 28, 'M', "A01", "QA", 40);

        System.out.println(tester1);
        tester1.testing();

        Developer developer1 = new Developer("Lorraine", 26, 'F', "C23", "Back-end Developer", 55, "Java");


        System.out.println(developer1);

        developer1.coding();
        developer1.fixingBug();


    }

}
