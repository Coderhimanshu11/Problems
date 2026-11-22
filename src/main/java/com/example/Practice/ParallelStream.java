package com.example.Practice;

import java.util.Arrays;

public class ParallelStream {
    public static void main(String[] args) {
        int[] arr=new int[1000000];
        Arrays.fill(arr,5);
        long startTimeP=System.currentTimeMillis();
        long sum_p=Arrays.stream(arr).
                mapToLong(num -> num*num).sum();
        long EndTime=System.currentTimeMillis();
        System.out.println(EndTime-startTimeP);

        long StartTime1=System.currentTimeMillis();
        long secondaryStream=Arrays.stream(arr).
                parallel().
                mapToLong(num -> num*num).sum();
        long EndTime1=System.currentTimeMillis();
        System.out.println(EndTime1-StartTime1);
    }
}
