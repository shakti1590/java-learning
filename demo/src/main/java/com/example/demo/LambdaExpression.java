package com.example.demo;

 interface Shape{
        void draw();
    }

// Traditional code

//    class Square implements Shape{
//        public void draw(){
//            System.out.println("Square : draw() method");
//        }
//    }
//    class Circle implements Shape{
//        public void draw(){
//            System.out.println("Circle class : draw() method");
//        }
//    }

// lambda expression code

//    public  class LambdaExpression {
//        public static void main(String[] args){
//            Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
//            rectangle.draw();
//            Shape square = () -> System.out.println("Square class : draw() method");
//            square.draw();
//            Shape circle = () -> System.out.println("Circle class : draw() method");
//            circle.draw();
//        }
//}

// How we can pass lambda expression as method parameter

public  class LambdaExpression {
    public static void main(String[] args){
        Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
//        rectangle.draw();
        Shape square = () -> System.out.println("Square class : draw() method");
//        square.draw();
        Shape circle = () -> System.out.println("Circle class : draw() method");
//        circle.draw();
        print(rectangle);
        print(square);
        print(circle);
    }
    private static void print(Shape shape){
        shape.draw();
    }
}



