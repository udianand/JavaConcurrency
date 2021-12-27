package com.home.practice;

public class PrintFooBar {
    private int limit;
    private int start = 0;
    private boolean lock = false;

    public PrintFooBar(int limit) {
        this.limit = limit;
    }

    public synchronized void printFoo() throws InterruptedException {
        while (lock) wait();
        lock = true;
        System.out.println("Foo");
        notifyAll();
    }

    public synchronized void printBar() throws InterruptedException {
        while (!lock) wait();
        lock = false;
        System.out.println("Bar");
        notifyAll();
    }
}
