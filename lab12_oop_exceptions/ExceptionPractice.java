package lab12_oop_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {

    public static void main(String[] args) throws FileNotFoundException {

        String str = null;

        try {
            String result = str.repeat(3);
            System.out.println(result);
            System.out.println("Try Block");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("catch Block");
            str = "Java";
            String result = str.repeat(3);
            System.out.println(result);
        }

        System.out.println("----------------------------------------------");


            new FileInputStream("src/lab12_oop_exceptions/lab12 class notes.txt");



    }


    public void method1() throws FileNotFoundException {
        new FileInputStream("src/lab12_oop_exceptions/lab12 class notes.txt");
    }

    public void method2(){
        //method1();
    }

    public void method3(){
        try {
            new FileInputStream("src/lab12_oop_exceptions/lab12 class notes.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void method4(){
        method3();
    }


}
