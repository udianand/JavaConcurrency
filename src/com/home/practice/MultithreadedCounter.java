package com.home.practice;

public class MultithreadedCounter {
    private int counter;
    private boolean lock = false;

    public synchronized int getCounter() throws InterruptedException {
        while (!lock) {
            wait();
        }
        lock = false;
        notifyAll();
        return counter;
    }

    public synchronized void setCounter(int counter) throws InterruptedException {
        while (lock) {
            wait();
        }
        lock = true;
        this.counter = counter;
        notifyAll();

    }
}

