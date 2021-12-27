package com.home.practice;

public class MultiThreadedFizzBuzz {
    private int limit;
    private int counter = 1;

    public MultiThreadedFizzBuzz(int limit) {
        this.limit = limit;
    }

    public synchronized void Fizz() throws InterruptedException {
        while (counter <= limit) {
            if (counter % 3 == 0 & counter % 5 != 0) {
                System.out.println("Fizz");
                counter += 1;
                notifyAll();
            }
            else wait();
        }
    }

    public synchronized void FizzBuzz() throws InterruptedException {
        while (counter <= limit) {
            if (counter % 5 == 0 & counter % 3 == 0) {
                System.out.println("FizzBuzz");
                counter += 1;
                notifyAll();
            }
            else wait();
        }
    }

    public synchronized void Buzz() throws InterruptedException {
        while (counter <= limit) {
            if (counter % 5 == 0 & counter % 3 != 0) {
                System.out.println("Buzz");
                counter += 1;
                notifyAll();
            }
            else wait();
        }
    }

    public synchronized void Number() throws InterruptedException {
        while (counter <= limit) {
            if (counter % 5 != 0 & counter %3 != 0 ) {
                System.out.println(counter);
                counter += 1;
                notifyAll();
            }
            else wait();
        }
    }
}
