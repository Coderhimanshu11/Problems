package com.example.Practice.Thread;

public class Gc {
    public static void main(String[] args) {
        byte[] bytes=new byte[150*1024*1024];
        for (int i = 0; i < 5000; i++) {
            Object object=new Object();
        }
        System.gc();
    }
}
