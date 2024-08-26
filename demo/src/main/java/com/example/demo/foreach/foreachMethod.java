package com.example.demo.foreach;

import java.util.ArrayList;
import java.util.List;

public class foreachMethod {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Ramesh",29));
        list.add(new Person("ram", 20));
        list.add(new Person("Rahul",30));

        //prior java8
        for(Person person: list){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        // using list of lambda
        list.forEach((person) ->{
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

        // using stream
        list.stream().forEach((person) ->{
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

    }
}
class Person{
    private String name;
    private int age;
    public Person(String name , int age){
        super();
        this.name=name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age= age;
    }
}
