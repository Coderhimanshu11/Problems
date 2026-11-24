package com.example.Practice;
import java.util.Optional;

public class OptinalExp {
    public Optional OptionalExample(int userId){
        if (userId==0){
            return Optional.empty();
        }else{
            return Optional.ofNullable("Himanshu");
        }
    }

    public static void main(String[] args) {
        OptinalExp findbyDb= new OptinalExp();

        Optional<String> opStr= findbyDb.OptionalExample(123);
        opStr.ifPresentOrElse(
                uname -> System.out.println(uname),
                () -> System.out.println("UserName not found")
        );
        opStr.map(u -> u.toUpperCase()).ifPresent(System.out::println);

    }
}
