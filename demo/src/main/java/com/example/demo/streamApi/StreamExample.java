package com.example.demo.streamApi;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //count , max , min method
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(stream.count());

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer integer = stream1.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min =>" + integer);

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer max = stream2.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max =>" + max);
    }
}
