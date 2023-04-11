package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskNmaesOfCountries {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(
                "Australia", "Canada", "Bosnia and Herzegovina", "Spain",
                "Argentina", "Malta", "United States of America", "Italy"
        ));
        System.out.println("-------------------------");
        System.out.println(list);


        list.removeIf(p->p.length()>=10);

        System.out.println("-------------------------");
        System.out.println(list);

    }
}

/*
6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater

 */