package ru.geekbrains.lesson3;


public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new PingPongRunnableImp( "Ping", 5));
        Thread t2 = new Thread(new PingPongRunnableImp( "Pong", 5));

        t1.start();
        t2.start();

    }

}

