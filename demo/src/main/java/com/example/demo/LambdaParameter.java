package com.example.demo;

interface Addable{
    int addition(int a, int b);
}

public class LambdaParameter {
    public static void main(String[] args){
        Addable addition = ( a, b) -> (a + b);
        int result = addition.addition(10, 20);
        System.out.println(result);
    }
}
