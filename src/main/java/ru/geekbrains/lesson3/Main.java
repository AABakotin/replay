package ru.geekbrains.lesson3;


public class Main {

    public static void main(String[] args) {
        Object mon = new Object();
        Thread t1 = new Thread(new PingPongRunnableImp(mon,"Ping", 5));
        Thread t2 = new Thread(new PingPongRunnableImp(mon, "Pong", 5));

        t1.start();
        t2.start();


    }

}

