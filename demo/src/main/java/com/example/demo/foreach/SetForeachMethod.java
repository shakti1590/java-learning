package com.example.demo.foreach;

import java.util.*;


public class SetForeachMethod {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("Ramesh",29));
        set.add(new Person("ram", 20));
        set.add(new Person("Rahul",30));

        //prior java 8
        for(Person person : set){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        // foreach+lambda method
        set.forEach((person ) ->{
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        // using stream
        set.stream().forEach((person) ->{
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
    }

}
