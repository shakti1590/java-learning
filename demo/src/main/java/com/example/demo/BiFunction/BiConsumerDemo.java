package com.example.demo.BiFunction;

// traditional way
import org.apache.logging.log4j.util.BiConsumer;

import java.util.HashMap;
import java.util.Map;
//public class BiConsumerDemo implements BiConsumer<Integer,Integer>{
//        public static void main(String[] args) {
//            BiConsumer<Integer,Integer> biConsumer = new com.example.demo.BiFunction.BiConsumerDemo();
//            biConsumer.accept(10,20);
//        }
//        public void accept(Integer a , Integer b){
//            System.out.println(a+b);
//        }
//}

// Using lambda
public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a-b);
        BiConsumer<Integer,Integer> addition = (a,b) -> System.out.println(a+b);
        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println(a*b);
        BiConsumer<Integer,Integer> divide = (a,b) -> System.out.println(a/b);
        biConsumer.accept(10,20);
        addition.accept(10,20);
        multiply.accept(20,30);
        divide.accept(30, 40);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"X");
        map.put(2,"c");
        map.put(3,"e");
        map.put(4,"l");
        map.put(5,"o");
        map.put(6,"r");
        map.put(7,"e");

        map.forEach((k,v) -> {
//            System.out.println(k);
            System.out.println(v);
        });
    }
}

