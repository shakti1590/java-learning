package com.example.demo.methodref;

import java.util.function.BiFunction;

public class methodRefExample {
    public static int addition(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        // Using lambda expression
        BiFunction<Integer,Integer,Integer> BiFunctional = (a,b) -> methodRefExample.addition(a,b);
                System.out.println(BiFunctional.apply(10,20));

// Using static method
        BiFunction<Integer,Integer,Integer> BiFunctionalLambda = methodRefExample::addition;
        System.out.println(BiFunctionalLambda.apply(10,20));
    }
}
