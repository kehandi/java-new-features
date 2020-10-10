package com.khd.thread;

public class Demo1 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread() + "thread run...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread() + "thread end.");
            }
        };
        t.start();
        System.out.println(Thread.currentThread() + "main end...");
    }
}
