package com.home.practice;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



class Main {

    public Main go(Main m1){
        m1 = null;
        return m1;
    }

    public static void main(String[] args) {
        Main m1 =  new Main();
        Main m2 =  new Main();
        Main m3 = m1.go(m2);
        m1 = null;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}