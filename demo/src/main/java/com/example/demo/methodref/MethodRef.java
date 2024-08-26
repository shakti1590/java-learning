package com.example.demo.methodref;


import java.util.function.Function;

public class MethodRef {

    public static void main(String[] args) {
       // 1. Method reference to Static method
        // lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // method reference
        Function<Integer, Double> functionRef = Math::sqrt;
        System.out.println(functionRef.apply(4));
    }
}
