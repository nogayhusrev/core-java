package day39_collections;

import java.util.ArrayList;

public class ThreadStressTesting {

    public static void main(String[] args) {
        ArrayList<ThreadStress> threads = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            threads.add(new ThreadStress(i));
        }
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }



    }
}


class ThreadStress extends Thread{



    public int threadNumber = 0;

    public ThreadStress(int i){
        threadNumber = i;
    }
    @Override
    public synchronized void run() {

        for (int i = 0; ; i++) {
            new Stress(threadNumber);
        }

    }
}


class Stress{


    public String name = "Adam";
    int threadNumber;
    public static int number = 0;


    public Stress(int threadNumber) {
        this.threadNumber = threadNumber;
        number++;
        System.out.println( number + " is created by thread" + threadNumber);

    }
}