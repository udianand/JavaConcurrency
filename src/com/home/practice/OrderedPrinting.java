package com.home.practice;

public class OrderedPrinting {
    private int status = 1;

    public synchronized void printFirst() throws InterruptedException {

        while (status != 1) wait();
        status = 2;
        System.out.println("First");
        notifyAll();
    }

    public synchronized void printSecond() throws InterruptedException {

        while (status != 2) wait();
        status = 3;
        System.out.println("Second");
        notifyAll();
    }

    public synchronized void printThird() throws InterruptedException {
        while (status != 3) wait();
        System.out.println("Third");
        notifyAll();
    }

}
