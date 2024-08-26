package com.example.demo.methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class RefrenceToConstructor {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
// using lambda
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        // using reference to constructor

        Function<List<String>, Set<String>> setFunctions = HashSet::new;
        System.out.println(setFunctions.apply(fruits));

    }
}
