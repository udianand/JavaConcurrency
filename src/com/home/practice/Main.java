package com.home.practice;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



class Main {

    public Main go(Main m1){
        m1 = null;
        return m1;
    }

    public static void main(String[] args) {
       ExecutorService executorService =  Executors.newFixedThreadPool(2);

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("Hello from Supply Async");
            return null;
        },executorService);

        executorService.shutdown();
        try {
            executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}