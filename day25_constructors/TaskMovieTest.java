package day25_constructors;

import java.time.LocalDate;

public class TaskMovieTest {
    public static void main(String[] args) {
        TaskMovie tm=new TaskMovie("Turkey","Adam","Adventure", LocalDate.of(2022,6,22),"NoOne");

        String [] names={"Tyson","James","Ozzy","Brooks","August","Sam"};
        tm.addCasts("Adam");
        tm.addCasts(names);

        System.out.println(tm);

    }
}
