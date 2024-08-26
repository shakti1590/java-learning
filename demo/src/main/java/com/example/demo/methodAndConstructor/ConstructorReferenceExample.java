package com.example.demo.methodAndConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceExample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConstructorReferenceExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("shakti","singh","xcelore");
        List<ConstructorReferenceExample> students = names.stream().map(ConstructorReferenceExample::new).collect(Collectors.toList());
        students.forEach(student -> System.out.println(student.getName()));
    }
}
