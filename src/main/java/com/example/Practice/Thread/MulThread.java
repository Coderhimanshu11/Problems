package com.example.Practice.Thread;

public class MulThread {
    public static void main(String[] args) {
        Runnable runnable= () ->{
            System.out.println("Thread started");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                throw new RuntimeException();
            }
            System.out.println("Thread 3 completed");
        };
        Thread objthread=new Thread(runnable,"Runnable thread");
        objthread.start();
    }
}