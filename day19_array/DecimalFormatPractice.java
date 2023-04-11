package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.0000");

        double n1 = 10.58765476474374754454564658465836342343865479656;

        System.out.println(  df.format(n1)  );



    }


}
