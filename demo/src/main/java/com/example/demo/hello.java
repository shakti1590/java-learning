package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;

@Component
public class hello {
   @Autowired // Field injection
    private Laptop laptop;

    // constructor injection

//    public hello(Laptop laptop){
//        this.laptop= laptop;
//    }

    // Setter injection

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void build(){
        laptop.compile();
        System.out.println("hello shakti");
    }
    interface MyFunctionalInterface {
        void execute();

        default void print(String text) {
            System.out.println("functional interface");
        }

        static void print(String text, PrintWriter writer) {
            writer.write(text);
        }
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("Executing...");
        myFunc.execute();
        myFunc.print("Calling default print method");

        PrintWriter writer = new PrintWriter(System.out, true);
        MyFunctionalInterface.print("Calling static print method", writer);
    }
}
