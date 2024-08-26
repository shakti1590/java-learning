package com.example.demo.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find element using findFirst() and findAny()

public class FindElementExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        } else{
            System.out.println("String is empty");
        }
        Optional<Integer> element1 = list.stream().findAny();
        if(element1.isPresent()){
            System.out.println(element1.get());
        } else {
            System.out.println("String is empty");
        }
    }
}
