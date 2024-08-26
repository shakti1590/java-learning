package com.example.demo.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

// traditional way

//public  class BiFunctionDemo implements BiFunction<Integer,Integer,Integer> {
//    public Integer apply(Integer t, Integer u){
//        return (t+u);
//    }
//    public static void main(String[] args) {
//        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionDemo();
//        System.out.println(biFunction.apply(10,20));
//        System.out.println(biFunction.apply(10,1000));
//    }
//}

// Using Lambda expression

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction= (t,u) -> (t+u);
        BiFunction<Integer,Integer,Integer> substract= (t,u) -> (t-u);
        BiFunction<Integer,Integer,Integer> multiply= (t,u) -> (t*u);
        BiFunction<Integer,Integer,Integer> divide= (t,u) -> (t/u);

        Function<Integer,Integer> function =(number) -> number*number;
        Integer integer = biFunction.andThen(function).apply(10,30);
        System.out.println(integer);
        System.out.println(biFunction.apply(10,20));
        System.out.println(substract.apply(20,20));
        System.out.println(multiply.apply(20,20));
        System.out.println(divide.apply(30,20));

    }
}
