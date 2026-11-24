package com.example.Practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> fInt = executor.submit(() -> {
                Thread.sleep(1000);
                return 10;
            });
            System.out.println(fInt.get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was intrupt");
        } catch (ExecutionException es) {
            System.out.println("Task execution failed" + es.getCause());
        } finally {

            executor.shutdown();
        }
    }
}
