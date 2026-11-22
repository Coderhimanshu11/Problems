package com.example.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Himanshu","Rohan","Sohaib","luo","Denni");
          List<String> strm=lst.stream().filter(name -> name.length()<=3)
                  .collect(Collectors.toList());
        System.out.println(strm);

        //primitive type array
        int[] array={1,2,3,4,5};
        IntStream streamobj=Arrays.stream(array);
        streamobj.forEach(System.out::println);
        //Object type arraay
        Integer[] array1={5,6,7};
        Stream<Integer> str=Stream.of(array1);
        str.forEach(System.out::println);

        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        int streamNumber_str=ls.stream().
                filter(numbers -> numbers%2==0) // find the even number
                .mapToInt(numbers -> numbers*numbers)
                .sum();
        System.out.println(streamNumber_str);
  List<String> upstr=Arrays.asList("Sudhanshu","Himanshu");

  List<String> upperstringconv= upstr.stream()
          .map(String::toUpperCase)
          .collect(Collectors.toList());
        System.out.println(upperstringconv);
    List<List<Integer>> nestedList=Arrays.asList(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5,6),
            Arrays.asList(7,8,9)
    );

    List<Integer> flattenedList=nestedList.stream()
            .flatMap(List::stream)
            .map(n-> n*2).collect(Collectors.toList());
        System.out.println(flattenedList);

    }
}
