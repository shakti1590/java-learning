package com.example.demo.streamApi;

import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        // create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        // create a stream from source
        Collection<String> collection = Arrays.asList("sh","ak","ti");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        // create a stream from list
        List <String> list = Arrays.asList("abc","fgh","def");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        // create a stream from Set
        Set <String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

        // create a stream from Array
        String [] strArray = {"a","b","c"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);
    }
}
