package day38_exceptions;

import utilities.Library;

import java.time.LocalTime;

public class Test {

    public static void main(String[] args)  {

        System.out.println("Hello Cydeo");

        // Thread.sleep(3500);
        Library.sleep(3.5);

        System.out.println("How are you today?");

        System.out.println("-----------------------------");

        if(LocalTime.now().equals(LocalTime.of(7,39))){
            throw new BreakTimeException();
        }

      //  throw new RuntimeException("Something went wrong");

        throw new BreakTimeException("Time to go home");

     //   throw new BreakTimeException();


    }

}
