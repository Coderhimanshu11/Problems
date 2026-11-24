package com.example.Practice;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrpandAgrPrac {
    record Product(String name, String Category, int price){}
    public static void main(String[] args) {

        List<Product> Products=List.of(
                new Product("Laptop","Electronics",34000),
                new Product("Fan","Electronic",3400),
                new Product("Bulb","Electronics",7620),
                new Product("Patato","Vegitable",120),
                new Product("Tomoato","Vegitable",2300),
                new Product("Biscuit","Grocery",23),
                new Product("namkeen","Grocery",234)
        );

        Map<String, List<Product>> lst= Products.stream().collect(Collectors.groupingBy(Product::Category));
        System.out.println(lst);
        Map<String,Integer> sumlst= Products.stream().collect(Collectors.groupingBy(Product::Category,
                Collectors.summingInt(Product::price)));
        System.out.println(sumlst);

        Map<String, IntSummaryStatistics> summariseInt= Products.stream().collect(Collectors.groupingBy(
                Product :: Category,
                Collectors.summarizingInt(Product::price)
        ));
        System.out.println(summariseInt);
    }
}
