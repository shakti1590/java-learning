package com.example.demo.function;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class function {
    public static void main(String[] args) {

        // Traditional component

//        Function<String, Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Xcelore"));

        // Using lambda
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Xcelore"));

    }
}
