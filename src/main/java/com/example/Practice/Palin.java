package com.example.Practice;

public class Palin {
    public static boolean palincheck(int x){
        if(x<0){
            return false;
        }
        int org=x;
        int rev= 0;
        while(x!=0){
            rev=rev*10 + x%10;
            x/=10;
        }
        return org==rev;
    }

    public static void main(String[] args) {
        int x=121;
        boolean core= palincheck(x);
        System.out.println(core);
    }
}
