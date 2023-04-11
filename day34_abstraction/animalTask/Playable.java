package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final

    /*
    private static void main(String[] args) {

        System.out.println(isFriendly);

       // isFriendly = false;
    }

    default void method1(){

    }
    */

     void play(); // abstract


}
