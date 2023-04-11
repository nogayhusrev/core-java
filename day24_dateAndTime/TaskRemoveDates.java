package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskRemoveDates {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates=new ArrayList<LocalDate>();

        dates.addAll(
                Arrays.asList(
                        LocalDate.of(2010,1,1),
                        LocalDate.of(2078,1,1),
                        LocalDate.of(2018,1,1),
                        LocalDate.of(2019,1,1),
                        LocalDate.of(2018,1,1),
                        LocalDate.of(2020,1,1)));

        System.out.println("-----------------");
        System.out.println(dates);

        dates.removeIf(p->p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println("-----------------");
        System.out.println("Dates before " + LocalDate.of(2016, 8, 15));
        System.out.println("-----------------");
        System.out.println(dates);



    }
}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */