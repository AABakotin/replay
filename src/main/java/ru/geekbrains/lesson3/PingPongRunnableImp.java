package ru.geekbrains.lesson3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PingPongRunnableImp extends Thread {
    private final String name;

    private final Object mon;

    private final ReentrantLock lock;
    private final int times;
    private int counter;

    private final Condition conditionMet;


    public PingPongRunnableImp(Object mon, String name, int times) {
        this.name = name;
        this.times = times;
        this.mon = mon;
        this.lock = new ReentrantLock(true);
        this.counter = 1;
        this.conditionMet = lock.newCondition();
    }


    @Override
    public void run() {

        synchronized (mon) {

            while (counter <= times) {
                lock.lock();
                try {
                    mon.wait(1000);
                    System.out.println(name + " " + counter);
                    counter++;
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        }

    }
}




