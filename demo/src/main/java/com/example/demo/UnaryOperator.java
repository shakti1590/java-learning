package com.example.demo;

class Test {
    public class UnaryOperator {
        public static void main(String[] args) {
            java.util.function.UnaryOperator<Integer> f = i -> (i + i);
            System.out.println(f.apply(10));
        }
    }
}
