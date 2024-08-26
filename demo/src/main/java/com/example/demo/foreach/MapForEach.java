package com.example.demo.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MapForEach {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Shakti", 21));
        map.put(2, new Person("Singh", 22));

        for (Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
        }
        map.forEach((k,v) ->{
            System.out.println(k);
            System.out.println(v.getName());
        });
    }
}
