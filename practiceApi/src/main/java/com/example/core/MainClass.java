package com.example.core;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        //Runnable myRun = new MyRunnable();
        Runnable myRun = ()->{
            for(int i=0;i<10;i++) {
                System.out.println("child thread "+Thread.currentThread().getId());
            }
        };
        Thread childThread = new Thread(myRun,"childThread");
        childThread.start();
        for(int i=0;i<10;i++) {
            System.out.println("hello world "+Thread.currentThread().getId());
        }

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(2,4,1);
        Collections.sort(list, (I1, I2) -> I1>I2?-1:I1<I2?1:0);
        System.out.println(list);

        Set<Integer> set = new TreeSet<>((I1, I2) -> I1>I2?-1:I1<I2?1:0);
        set.add(20);
        set.add(30);
        System.out.println(set);
    }
}
