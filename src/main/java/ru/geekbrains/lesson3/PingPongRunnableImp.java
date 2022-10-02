package ru.geekbrains.lesson3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PingPongRunnableImp implements Runnable {
    private  String name;

    private final ReentrantLock lock;
    private  int times;
    private int counter;

    private final Condition conditionMet;


    public PingPongRunnableImp(String name, int times) {
        this.name = name;
        this.times = times;
        this.lock = new ReentrantLock(true);
        this.counter = 1;
        this.conditionMet = lock.newCondition();
    }


    @Override
    public void run() {
        while (counter<=times) {
            lock.lock();
            try {
                conditionMet.await(1, TimeUnit.SECONDS);
                System.out.println(name + " " + counter);
                counter++;
                conditionMet.signal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}




