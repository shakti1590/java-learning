package com.example.demo.function;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        // Traditional way

//        Consumer <String> consumer = new ConsumerImpl();
//        consumer.accept("xcelore");

        // using Lambda expression

        Consumer <String> consumer = (s) -> System.out.println(s);
        consumer.accept("xcelore");
    }
}
