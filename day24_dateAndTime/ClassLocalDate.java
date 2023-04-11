package day24_dateAndTime;

import java.time.LocalDate;

public class ClassLocalDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("-----------------");
        System.out.println(today);

        LocalDate bithDay=LocalDate.of(1990,8,31);

        System.out.println("-----------------");
        System.out.println(bithDay);


        System.out.println("-----------------");
        System.out.println(today.getYear());
        System.out.println("-----------------");
        System.out.println(today.getDayOfWeek());
        System.out.println("-----------------");
        System.out.println(today.getDayOfMonth());
        System.out.println("-----------------");
        System.out.println(today.getDayOfYear());

        System.out.println("-----------------");
        System.out.println(today.getMonthValue());

        System.out.println("-----------------");
        System.out.println(today.plusYears(1000));

        System.out.println("-----------------");
        System.out.println(today.minusYears(2500));


        LocalDate graduationDate=LocalDate.of(2015,7,3);

        System.out.println("-----------------");
        System.out.println(graduationDate);


        System.out.println("-----------------");
        System.out.println(graduationDate.plusWeeks(6));
    }
}
