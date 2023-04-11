package day15_whileLoop;
import java.util.Scanner;
public class SecondsToMinutesAndHours {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        long inputSeconds=0L;
        int
                hours,
                minutes,
                seconds;

        System.out.println("Enter seconds:");
        inputSeconds=scan.nextInt();

        hours= (int) (inputSeconds/3600);
        minutes= (int) (inputSeconds%3600/60);
        seconds= (int) (inputSeconds%3600%60);

        System.out.println(hours + " hours, " + minutes +" minutes, and " + seconds + " seconds");

    }
}
