package com.example.demo;

public interface FunctionalInterface{
    void print(String msg);

    default void m1(){
        System.out.println("Default method");
    }
    static void m2(){
        System.out.println("Static method");
    }
}

