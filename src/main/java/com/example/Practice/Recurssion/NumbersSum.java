package com.example.Practice.Recurssion;

public class NumbersSum {
    public int NumbersSum(int n){
        if (n==0){
            return 0;
        }
        return n+NumbersSum(n-1);
    }

    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n=4;
        NumbersSum obj=new NumbersSum();
        System.out.println(obj.factorial(n));
       // System.out.println(obj.NumbersSum(n));
    }
}
