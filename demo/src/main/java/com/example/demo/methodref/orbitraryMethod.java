package com.example.demo.methodref;

import java.util.function.Function;

public class orbitraryMethod {
    public static void main(String[] args) {
        // Lambda Expression
        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Xcelore"));
        // Reference method
        Function<String, String> stringFunctions = String::toLowerCase;
        System.out.println(stringFunctions.apply("Xcelore"));
    }
}
