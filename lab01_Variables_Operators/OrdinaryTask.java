package lab01_Variables_Operators;

public class OrdinaryTask {

    public static void main(String[] args) {

        double rate = 0.5;
        double delta = 200;  //implicit casting
        int result1 = (int) (rate * rate + delta);  //explicit casting

        int salary = 50000;
        int bonus = 5000;
        double result2 = 2 * (salary + bonus);

        int time = 50;
        int mass = 100;
        double result3 = 1 / time + 3 * mass;  // (1/time) + (3*mass)
        double result4 = 1 / (time + 2 * mass);

        System.out.println((2+3)*2/3%2);
        



    }
}
