package com.example.demo.methodAndConstructor;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
        List<String> students = Arrays.asList("shakti","singh","xcelore");
        students.forEach(methodReferenceExample::print);
    }
    public void print(String s){
        System.out.println(s);
    }
}
