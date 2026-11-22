package com.example;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class ParallelStream {
    public static void main(String[] args) throws Exception{
        List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Default parallel stream");
        ls.parallelStream().peek(num -> System.out.println(
                Thread.currentThread().getName()+"Processing"+num)).
                forEach(num ->{});

        ForkJoinPool customThreadpool=new ForkJoinPool(4);
        System.out.println("custom prallel stream with the 4 thread");
        customThreadpool.submit(() ->
                ls.parallelStream()
                        .peek(num -> System.out.println(
                                Thread.currentThread().getName()+"Processing" +num))
                        .forEach(num ->{})).get();
                   customThreadpool.shutdown();

    }
}
