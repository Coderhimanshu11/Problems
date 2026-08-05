package com.example.Practice.Recurssion;

public class Incr {
    public void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=10;
        Incr ins=new Incr();
        ins.print(n);
    }
}
