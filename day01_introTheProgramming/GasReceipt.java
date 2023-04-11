package day01_intoTheProgrammingSelfPracticing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GasReceipt {

    public static void main(String[] args) {
        System.out.println("    MCLEAN STORE    ");
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a").format(LocalDateTime.now()));
        System.out.println();
        System.out.println("Gallons:        11.48");
        System.out.println("Price/Gallon:   $4.15");
        System.out.println();
        System.out.println("Fuel Total:     $47.642");


    }
}
