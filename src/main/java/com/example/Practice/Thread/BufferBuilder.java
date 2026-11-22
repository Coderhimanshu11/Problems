package com.example.Practice.Thread;

public class BufferBuilder {
    public static void main(String[] args) {
        // string buffer thread safe for the Multithreading env bcz it is Synchronized and the thread safe
//        StringBuilder stringBuilder=new StringBuilder();
//        Thread t1=new Thread(()->
//        {
//            for (int i = 0; i <1000 ; i++) {
//                stringBuilder.append("A");
//            }
//        });
//        Thread t2=new Thread(()->
//        {
//            for (int i = 0; i < 1000; i++) {
//                stringBuilder.append("B");
//            }
//        });
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//
//        };
        StringBuffer stringBuffer=new StringBuffer();

        Thread t1=new Thread(()->
        {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("H");

            }
        });
        Thread t2=new Thread(()->
        {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("I");

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        };

        System.out.println(stringBuffer.toString().length());
    }
}
