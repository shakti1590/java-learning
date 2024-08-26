package com.example.demo;

interface Shapes{
    void draw();
}
class Rectangle implements Shapes{
    @Override
    public void draw() {
        System.out.println("Rectangle draw method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Shapes rectangle = () -> System.out.println("Rectangle draw method");
        rectangle.draw();
    }
}
